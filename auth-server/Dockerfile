FROM openjdk:8-jdk-alpine

MAINTAINER Sergiy Bruksha <sbruksha@gmail.com>

ENV DOCKERIZE_VERSION v0.3.0

RUN apk add --no-cache curl wget

RUN wget https://github.com/jwilder/dockerize/releases/download/$DOCKERIZE_VERSION/dockerize-linux-amd64-$DOCKERIZE_VERSION.tar.gz \
    && tar -C /usr/local/bin -xzvf dockerize-linux-amd64-$DOCKERIZE_VERSION.tar.gz \
    && rm dockerize-linux-amd64-$DOCKERIZE_VERSION.tar.gz

ADD build/libs/auth-server*.jar app.jar

ENV JAVA_OPTS=""

ENTRYPOINT dockerize -wait http://config-server:8888/auth-server/default -timeout ${TIMEOUT:-240s} && exec java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /app.jar