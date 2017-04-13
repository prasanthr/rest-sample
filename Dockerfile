FROM ubuntu:trusty


ADD target/rest-sample-with-boot-0.0.1.deb /tmp

RUN apt-get -y update 
RUN apt-get install software-properties-common -y
RUN add-apt-repository ppa:openjdk-r/ppa
RUN apt-get update -y
RUN apt-get upgrade -y
RUN apt-get install -y openjdk-8-jre
RUN dpkg -i /tmp/rest-sample-with-boot-0.0.1.deb

ENTRYPOINT /usr/bin/java -jar /var/spring-boot-app/rest-sample-with-boot-0.0.1-SNAPSHOT.jar