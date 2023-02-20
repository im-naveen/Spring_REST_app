FROM openjdk:8
ADD C:\Users\10692645\.jenkins\workspace\Docker_Test\private-eye-server\target\private-eye-server-0.0.1-SNAPSHOT.war canvas.war
ENTRYPOINT ["java", "-jar","canvas.war"]
EXPOSE 8080
