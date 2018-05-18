FROM openjdk:8-jdk-alpine

MAINTAINER Sergiy Bruksha <sbruksha@gmail.com>

ADD target/store-service*.jar app.jar

RUN bash -c 'touch /app.jar'

ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
