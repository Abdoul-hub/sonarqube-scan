FROM eclipse-temurin:17-jdk
LABEL authors="togola080925"
EXPOSE 8080
WORKDIR /opt
COPY *.jar  /opt/app.jar
ENTRYPOINT ["java", "-jar", "/opt/app.jar"]
