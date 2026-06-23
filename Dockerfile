# syntax=docker/dockerfile:1
FROM hexletbasics/base-image:latest

ENV COURSE_DIR=/exercises-java

WORKDIR ${COURSE_DIR}

# JDK ставим из Eclipse Temurin tarball, а не через apt: в базовом образе
# (Debian bookworm) apt предлагает только openjdk-17, поэтому LTS 25 берём
# напрямую из Adoptium. Подход не зависит от дистрибутива базы и multi-arch.
ARG JDK_VERSION=25
ENV JAVA_HOME=/opt/jdk
ENV GRADLE_HOME=/opt/gradle
ENV PATH=${COURSE_DIR}/bin:${JAVA_HOME}/bin:${GRADLE_HOME}/bin:$PATH

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

# Gradle ставим только ради линтинга кода через spotless (google-java-format).
# Студенты Gradle не используют — у них остаётся голый javac; это инструмент CI.
ARG GRADLE_VERSION=9.6.0
RUN curl -fsSL "https://services.gradle.org/distributions/gradle-${GRADLE_VERSION}-bin.zip" -o /tmp/gradle.zip \
  && unzip -q /tmp/gradle.zip -d /opt \
  && mv /opt/gradle-${GRADLE_VERSION} ${GRADLE_HOME} \
  && rm /tmp/gradle.zip

COPY . .

# Прогреваем кэш Gradle (плагин spotless + google-java-format) внутрь образа,
# чтобы линтинг в CI не тянул зависимости по сети на каждом прогоне.
RUN gradle --no-daemon spotlessCheck || true
