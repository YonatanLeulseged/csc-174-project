FROM maven:3.8.6-jdk-11-slim AS build
COPY libs /home/app/libs
COPY src /home/app/src
COPY pom.xml /home/app
COPY target /home/app/target
WORKDIR /home/app