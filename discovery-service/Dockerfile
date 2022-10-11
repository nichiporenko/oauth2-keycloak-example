FROM openjdk:11-slim
VOLUME /tmp
COPY build/libs/discovery-service-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]


#1 ./gradlew build
#2 docker compose commands