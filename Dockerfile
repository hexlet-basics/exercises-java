FROM hexletbasics/base-image:latest

WORKDIR /exercises-java

ENV PATH=/exercises-java/bin:$PATH

RUN apt-get update && apt-get install -yqq openjdk-21-jdk

ENV CHECKSTYLE_VERSION 10.22.0
RUN curl -L https://github.com/checkstyle/checkstyle/releases/download/checkstyle-${CHECKSTYLE_VERSION}/checkstyle-${CHECKSTYLE_VERSION}-all.jar > /opt/checkstyle.jar
RUN chmod 777 /opt/checkstyle.jar

ENV ASSERTJ_VERSION 3.24.2
RUN curl -L https://repo1.maven.org/maven2/org/assertj/assertj-core/${ASSERTJ_VERSION}/assertj-core-${ASSERTJ_VERSION}.jar > /opt/assertj.jar
RUN chmod 777 /opt/assertj.jar

ENV COMMONS_LANG3_VERSION 3.14.0
RUN curl -L https://repo1.maven.org/maven2/org/apache/commons/commons-lang3/${COMMONS_LANG3_VERSION}/commons-lang3-${COMMONS_LANG3_VERSION}.jar > /opt/commons_lang3.jar
RUN chmod 777 /opt/commons_lang3.jar

COPY . .
