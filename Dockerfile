FROM openjdk:17
EXPOSE 8080
ADD target/paypilot-api.jar paypilot-api.jar
ENTRYPOINT ["java","-jar","/paypilot-api.jar"]