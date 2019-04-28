FROM java:8
VOLUME /tmp
ADD SpringBoot.jar front.jar
RUN bash -c 'touch /front.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/front.jar"]