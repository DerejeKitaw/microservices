FROM java:8
EXPOSE 8080
ADD /target/spring-boot-mongodb-0.0.1-SNAPSHOT.jar spring-boot-mongodb-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-Dspring.data.mongodb.uri=mongodb://mongo/test", "-Djava.security.egd=file:/dev/./urandom","-jar","spring-boot-mongodb-0.0.1-SNAPSHOT.jar"]
