# Start with a base image containing Java runtime
#FROM openjdk:8-jdk-alpine
FROM java:8
# Add Maintainer Info
LABEL maintainer="SKP"

# Add a volume pointing to /tmp
VOLUME /tmp


# Add the application's jar to the container
ADD employeeproducer-0.0.1-SNAPSHOT.jar employeeproducer.jar

#RUN bash -c 'touch /employeeproducer.jar'
# Run the jar file 
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/employeeproducer.jar"]

EXPOSE 8081
