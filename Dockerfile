FROM openjdk:23-jdk AS compiler

ARG COMPILE_DIR=/code_folder

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

FROM openjdk:23-jdk

ARG DEPLOY_DIR=/app

WORKDIR ${DEPLOY_DIR}

COPY --from=compiler /code_folder/target/vttp5a-day7-0.0.1-SNAPSHOT.jar vttp5a-ssf-day7.jar

ENV SERVER_PORT=3000

EXPOSE ${SERVER_PORT}

ENTRYPOINT [ "java", "-jar", "target/vttp5a-ssf-day7.jar" ]


