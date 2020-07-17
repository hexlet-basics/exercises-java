FROM hexletbasics/base-image:latest

RUN apt-get update && apt-get install -y default-jdk

RUN curl -L https://github.com/checkstyle/checkstyle/releases/download/checkstyle-8.31/checkstyle-8.31-all.jar > /opt/checkstyle.jar
RUN chmod 777 /opt/checkstyle.jar

RUN curl -L https://repo1.maven.org/maven2/org/assertj/assertj-core/3.15.0/assertj-core-3.15.0.jar > /opt/assertj.jar
RUN chmod 777 /opt/assertj.jar

WORKDIR /exercises-java

COPY . .

