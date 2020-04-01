FROM openjdk:15-oracle

# ENV LANG C.UTF-8
# ENV LC_ALL C.UTF-8

# RUN yum install -y langpacks-en glibc-all-langpacks
RUN yum install -y oracle-nodejs-release-el7 oracle-release-el7
RUN yum install -y make git curl python3-pip

RUN yum install -y nodejs
RUN yum install -y jq

RUN pip3 install yamllint
RUN pip3 install yq
RUN npm install -g ajv-cli

RUN curl -L https://github.com/checkstyle/checkstyle/releases/download/checkstyle-8.31/checkstyle-8.31-all.jar > /opt/checkstyle.jar
RUN chmod 777 /opt/checkstyle.jar

RUN curl -L https://repo1.maven.org/maven2/org/assertj/assertj-core/3.15.0/assertj-core-3.15.0.jar > /opt/assertj.jar
RUN chmod 777 /opt/assertj.jar

WORKDIR /exercises-java
COPY . /exercises-java

