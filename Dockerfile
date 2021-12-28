FROM openjdk:8-jdk-alpine
USER root
COPY . /source
WORKDIR /source
RUN ./gradlew build
EXPOSE 8080
ENTRYPOINT ["java","-jar","build/libs/docker-demo-0.0.1-SNAPSHOT.jar"]