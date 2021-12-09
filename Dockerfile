FROM hexletbasics/base-image:latest

RUN apt-get update && apt-get install -y openjdk-17-jdk

ENV CHECKSTYLE_VERSION 9.2
RUN curl -L https://github.com/checkstyle/checkstyle/releases/download/checkstyle-${CHECKSTYLE_VERSION}/checkstyle-${CHECKSTYLE_VERSION}-all.jar > /opt/checkstyle.jar
RUN chmod 777 /opt/checkstyle.jar

ENV ASSERTJ_VERSION 3.21.0
RUN curl -L https://repo1.maven.org/maven2/org/assertj/assertj-core/${ASSERTJ_VERSION}/assertj-core-${ASSERTJ_VERSION}.jar > /opt/assertj.jar
RUN chmod 777 /opt/assertj.jar

ENV COMMONS_LANG3_VERSION 3.12.0
RUN curl -L https://repo1.maven.org/maven2/org/apache/commons/commons-lang3/${COMMONS_LANG3_VERSION}/commons-lang3-${COMMONS_LANG3_VERSION}.jar > /opt/commons_lang3.jar
RUN chmod 777 /opt/commons_lang3.jar

# ENV GRAAL_VERSION 21.3.0
# ENV JAVA_VERSION java11
# ENV GRAAL_BASE_PATH /opt/graalvm-ce-${JAVA_VERSION}-${GRAAL_VERSION}

# ENV GRAAL_RELEASE_URL https://github.com/graalvm/graalvm-ce-builds/releases/download/vm-${GRAAL_VERSION}/graalvm-ce-java11-linux-amd64-${GRAAL_VERSION}.tar.gz

# RUN curl --fail --silent --location --retry 3 ${GRAAL_RELEASE_URL} | gunzip | tar x -C /opt/

# ENV PATH ${GRAAL_BASE_PATH}/bin:$PATH
# ENV JAVA_HOME {$GRAAL_BASE_PATH}

WORKDIR /exercises-java

COPY . .

ENV PATH /exercises-java/bin:$PATH
