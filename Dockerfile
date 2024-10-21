FROM openjdk:17-jdk-slim
#FROM openjdk:17-oracle
RUN apt-get update && apt-get install -y sudo
RUN adduser --disabled-password --gecos "" user  \
    && echo 'user:user' | chpasswd \
    && adduser user sudo \
    && echo 'user ALL=(ALL) NOPASSWD:ALL' >> /etc/sudoers
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
