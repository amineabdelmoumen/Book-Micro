FROM openjdk:11

ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} billing-service.jar
ENTRYPOINT ["java","-jar","/billing-service.jar"]