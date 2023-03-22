FROM openjdk:11

VOLUME /tmp

COPY target/PayPilotApi-0.0.1-SNAPSHOT.jar PayPilotApi.jar
#COPY target/food*.jar food.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "PayPilotApi.jar"]