#FROM openjdk:17
#ADD /target/demo-project-0.0.1-SNAPSHOT.jar demo.jar
#EXPOSE 8080
#ENTRYPOINT ["java","-jar","demo.jar"]

FROM openjdk:17
EXPOSE 8084
ADD /target/demo-project-0.0.1-SNAPSHOT.jar demo.jar
ENTRYPOINT ["java","-jar","demo.jar"]