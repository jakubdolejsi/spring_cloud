#FROM openjdk:15-jdk-buster

#RUN addgroup -S spring && adduser -S spring -G spring
#USER spring:spring
#
#RUN apt-get update && apt-get install -y maven
#
#COPY . /user-service
#
#RUN cd /user-service && mvn package
#RUN ls /user-service && echo -n "******************\n"
#RUN ls /user-service/target -all
#
##ADD target/user-service.jar user-service.jar
#ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "/user-service/target/user-service.jar"]

#FROM maven:3-openjdk-15-slim

#WORKDIR /user-service

#COPY . /user-service
#RUN apt-get update && apt-get install dos2unix && dos2unix /user-service/entrypoint.sh && chmod +x /user-service/entrypoint.sh

#Start application
#CMD ["ls -all"]
#ENTRYPOINT ["mvn", "/user-service/spring-boot:build-image"]
#CMD ["bash"]