FROM java:8

MAINTAINER Sergiy Bruksha <sbruksha@gmail.com>

ADD build/libs/monitoring*.jar app.jar

RUN bash -c 'touch /app.jar'

ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
