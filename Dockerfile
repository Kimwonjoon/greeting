#FROM openjdk:17-jdk-slim
FROM eclipse-temurin:17-jdk-alpine as build
WORKDIR /land
COPY . .
RUN ./gradlew clean bootJar
# 위는 빌드할때만 아래는 run 할때의 환경을 이중으로 가져가는 느낌
FROM eclipse-temurin:17-jre-alpine as run
COPY --from=build /land/build/libs/*.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
