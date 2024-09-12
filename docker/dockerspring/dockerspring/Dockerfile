FROM openjdk:22
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} teste.jar
ENTRYPOINT ["java","-jar","/teste.jar"]