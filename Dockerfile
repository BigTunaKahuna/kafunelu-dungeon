FROM adoptopenjdk/openjdk11:alpine-slim
ARG JAR_FILE=build/libs/kafunelu-dungeon-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]