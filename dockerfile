FROM openjdk:21

ARG JAR_FILE=target/*.jar 

COPY ${JAR_FILE} devops-hello-app.jar



EXPOSE 8080

ENTRYPOINT ["java", "-jar", "devops-hello-app.jar"]