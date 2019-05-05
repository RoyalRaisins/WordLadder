FROM java:8
VOLUME /tmp
ADD login-v0.1.jar login.jar
RUN bash -c 'touch /login.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/login.jar"]
