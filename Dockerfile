FROM openjdk:8-jdk-alpine
VOLUME /tmp
ADD /build/libs/hello-rest-service-0.1.0.jar app.jar
RUN echo $(ls tmp)
ENTRYPOINT ["java", "-Djava.security.edg=file:/dev/./urandom","-jar","app.jar"]