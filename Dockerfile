# syntax=docker/dockerfile:1
FROM hexletbasics/base-image:latest

ENV COURSE_DIR=/exercises-java

WORKDIR ${COURSE_DIR}

# JDK ставим из Eclipse Temurin tarball, а не через apt: в базовом образе
# (Debian bookworm) apt предлагает только openjdk-17, поэтому LTS 25 берём
# напрямую из Adoptium. Подход не зависит от дистрибутива базы и multi-arch.
ARG JDK_VERSION=25
ENV JAVA_HOME=/opt/jdk
ENV PATH=${COURSE_DIR}/bin:${JAVA_HOME}/bin:$PATH

RUN ARCH=$(dpkg --print-architecture) \
  && case "$ARCH" in \
       amd64) JARCH=x64 ;; \
       arm64) JARCH=aarch64 ;; \
       *) echo "unsupported arch: $ARCH" && exit 1 ;; \
     esac \
  && mkdir -p ${JAVA_HOME} \
  && curl -fsSL "https://api.adoptium.net/v3/binary/latest/${JDK_VERSION}/ga/linux/${JARCH}/jdk/hotspot/normal/eclipse" -o /tmp/jdk.tar.gz \
  && tar -xzf /tmp/jdk.tar.gz -C ${JAVA_HOME} --strip-components=1 \
  && rm /tmp/jdk.tar.gz

ARG ASSERTJ_VERSION=3.27.7
ARG COMMONS_LANG3_VERSION=3.20.0

RUN curl -L https://repo1.maven.org/maven2/org/assertj/assertj-core/${ASSERTJ_VERSION}/assertj-core-${ASSERTJ_VERSION}.jar -o /opt/assertj.jar \
  && curl -L https://repo1.maven.org/maven2/org/apache/commons/commons-lang3/${COMMONS_LANG3_VERSION}/commons-lang3-${COMMONS_LANG3_VERSION}.jar -o /opt/commons_lang3.jar \
  && chmod 644 /opt/assertj.jar /opt/commons_lang3.jar

# Maven стоит здесь ради единственного плагина — spotless, который проверяет формат кода уроков
# (см. pom.xml). Своей программы у spotless нет, он существует только плагином к maven или gradle.
# Линия 3.9: у Maven 4 пока нет релиза, в дистрибутиве Apache лежит rc.
#
# Ставим из tar.gz, а не из apt: пакет maven в Debian тянет за собой второй JDK, а тут уже стоит
# Temurin из шага выше.
ARG MAVEN_VERSION=3.9.16
ENV MAVEN_HOME=/opt/maven
ENV PATH=${MAVEN_HOME}/bin:$PATH

RUN mkdir -p ${MAVEN_HOME} \
  && curl -fsSL "https://archive.apache.org/dist/maven/maven-3/${MAVEN_VERSION}/binaries/apache-maven-${MAVEN_VERSION}-bin.tar.gz" -o /tmp/maven.tar.gz \
  && tar -xzf /tmp/maven.tar.gz -C ${MAVEN_HOME} --strip-components=1 \
  && rm /tmp/maven.tar.gz

# Прогрев локального репозитория: сам плагин и google-java-format скачиваются один раз на сборке,
# а не при каждом запуске make code-lint. Прогон идёт по файлу-пустышке, потому что код уроков
# приезжает следующим слоем: иначе любая правка урока сбрасывала бы кеш и тянула зависимости
# заново.
COPY pom.xml .
RUN mkdir -p modules/warmup \
  && printf 'class Warmup {}\n' > modules/warmup/Warmup.java \
  && mvn -B spotless:apply \
  && rm -rf modules/warmup

COPY . .
