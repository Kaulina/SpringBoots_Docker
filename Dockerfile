FROM openjdk:17-slim
#ADD target/rest-demo-0.0.1-SNAPSHOT.jar app.jar
ADD target/SpringBoots_REST-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]