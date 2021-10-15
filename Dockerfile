FROM hexletbasics/base-image:latest

RUN apt-get update && apt-get install -y default-jdk

ENV CHECKSTYLE_VERSION 9.0.1
ENV ASSERTJ_VERSION 3.21.0

RUN curl -L https://github.com/checkstyle/checkstyle/releases/download/checkstyle-${CHECKSTYLE_VERSION}/checkstyle-${CHECKSTYLE_VERSION}-all.jar > /opt/checkstyle.jar
RUN chmod 777 /opt/checkstyle.jar

RUN curl -L https://repo1.maven.org/maven2/org/assertj/assertj-core/${ASSERTJ_VERSION}/assertj-core-${ASSERTJ_VERSION}.jar > /opt/assertj.jar
RUN chmod 777 /opt/assertj.jar

WORKDIR /exercises-java

COPY . .

ENV PATH=/exercises-java/bin:$PATH
