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

ARG CHECKSTYLE_VERSION=13.6.0
ARG ASSERTJ_VERSION=3.27.7
ARG COMMONS_LANG3_VERSION=3.20.0

RUN curl -L https://github.com/checkstyle/checkstyle/releases/download/checkstyle-${CHECKSTYLE_VERSION}/checkstyle-${CHECKSTYLE_VERSION}-all.jar -o /opt/checkstyle.jar \
  && curl -L https://repo1.maven.org/maven2/org/assertj/assertj-core/${ASSERTJ_VERSION}/assertj-core-${ASSERTJ_VERSION}.jar -o /opt/assertj.jar \
  && curl -L https://repo1.maven.org/maven2/org/apache/commons/commons-lang3/${COMMONS_LANG3_VERSION}/commons-lang3-${COMMONS_LANG3_VERSION}.jar -o /opt/commons_lang3.jar \
  && chmod 644 /opt/checkstyle.jar /opt/assertj.jar /opt/commons_lang3.jar

COPY . .
