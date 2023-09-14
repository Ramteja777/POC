FROM openjdk
WORKDIR /
ADD build/libs/POC-0.1.3.jar /
EXPOSE 8080
CMD java -jar POC-0.1.3.jar
