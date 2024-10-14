FROM eclipse-temurin:21-alpine
VOLUME /tmp
EXPOSE 8080
ARG JAR_FILE=target/coleta-lixo-0.0.1-SNAPSHOT.jar
ADD JAR_FILE app.jar
ENV PROFILE=prd
ENTRYPOINT ["java","-Dspring.profiles.active=${PROFILE}","-jar","/app.jar"]