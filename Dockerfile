FROM openjdk:15-slim

ENV LANG C.UTF-8
ENV LC_ALL C.UTF-8

RUN apt-get update && apt-get install -yqq git python3-pip
RUN apt-get install -yqq nodejs npm

RUN pip3 install yamllint
RUN apt-get install -yqq jq
RUN pip3 install yq
RUN npm install -g ajv-cli

WORKDIR /exercises-java
COPY . /exercises-java

