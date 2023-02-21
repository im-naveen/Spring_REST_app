FROM openjdk:8
ADD /var/lib/jenkins/workspace/Docker_Test/target/ZSBProject1-0.0.1-SNAPSHOT.jar test.jar
ENTRYPOINT ["java", "-jar","test.jar"]
EXPOSE 8085
