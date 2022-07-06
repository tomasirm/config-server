FROM adoptopenjdk/openjdk11:alpine-jre
ADD /home/runner/work/config-server/config-server/target/config-server-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java", "-jar", "./app.jar"]
