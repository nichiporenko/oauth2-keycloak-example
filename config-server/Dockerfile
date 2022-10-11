FROM openjdk:11-slim
VOLUME /tmp
COPY build/libs/config-server-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]


#1 ./gradlew build
#3 docker compose commands

# http://localhost:8071/image-holder/default