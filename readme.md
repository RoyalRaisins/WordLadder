dockerhub repository url:
https://cloud.docker.com/repository/docker/royalrasins/hello_docker


For Homeword3, the url is:
https://cloud.docker.com/repository/docker/royalrasins/se_homeword3
##
Brief guide:
run image login with

`-p 8083:8083` 

and iamge function with

`-p 8082:8082`

Because I fixed the ports at which the service will be listening.

Also make sure that the docker's IP is 192.168.99.100 because it's also fixed in code.

To invoke the service, type url 192.168.99.100:8083 or 192.168.99.100:8083/ladder in the browser, log in 
with 

Username: user

Password:12349876

And redirect manually by typing 192.168.99.100:8083/ladder to the functional
frontend page. It should be quite clear concerning what to do with the page.

The dockerfiles are in the dockerfiles directory.