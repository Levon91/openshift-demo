FROM openjdk:8
EXPOSE 8080
ADD target/openshift-demo.jar openshift-demo.jar
ENTRYPOINT ["java", "-jar", "/openshift-demo.jar"]