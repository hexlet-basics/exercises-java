FROM openjdk:11-jdk-slim

ENV LANG C.UTF-8
ENV LC_ALL C.UTF-8

RUN apt-get update && apt-get install -yqq git python3-pip

RUN pip3 install yamllint

WORKDIR /exercises-java

ENV JAVAPATH=/exercises-java/src

COPY . /exercises-java
RUN jshell --help #NOTE: create preferences dir
