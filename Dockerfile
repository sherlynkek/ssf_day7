FROM openjdk:23-jdk

ARG app-dir=/app

WORKDIR ${app-dir}

COPY .mvn .mvn
COPY src src
COPY pom.xml .
COPY mvnw .
COPY mvnw.cmd .

RUN chmod a+x ./mvnw

RUN ./mvnw clean package -Dmaven.tests.skip=true

ENV SERVER_PORT 3000

EXPOSE ${SERVER_PORT}

# run application using ENTRYPOINT or CMD
ENTRYPOINT ["java", "-jar", "target/vttp5a-day7-0.0.1-SNAPSHOT.jar"]