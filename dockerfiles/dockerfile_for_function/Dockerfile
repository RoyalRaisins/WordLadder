FROM java:8
VOLUME /tmp
ADD demo-0.0.1-SNAPSHOT.jar function.jar
RUN bash -c 'touch /function.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/function.jar"]
