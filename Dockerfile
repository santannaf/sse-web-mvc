#FROM maven:3.6.0-alpine AS build
#WORKDIR /app
#COPY src /app/src
#COPY pom.xml /app
#RUN mvn -f /app/pom.xml clean package
#
#FROM openjdk:15-alpine as java
#WORKDIR /app
#COPY --from=build /app/target/sse-project.jar /app
#ENTRYPOINT ["java","-jar","sse-project.jar"]



