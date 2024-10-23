# Getting Started

### Jenkins
- http://localhost:8080

### Run
```bash
$ ./gradlew bootRun
```

```bash
$ ./gradlew [build|bootJar]
$ java -jar build/libs/greeting-0.0.1-SNAPSHOT.jar
```

### Docker
```bash
$ docker build -t datamario24/greeting:temurin .
$ docker run -d --name temurin -p 8080:8080 datamario24/greeting:temurin
```

### Docker compose
```bash
$ docker compose up -d --force-recreate --build
$ docker compose stop
$ docker compose start
$ docker compose ls
$ docker compose  down
```

### API
```bash
# docker
$ curl -X GET http://localhost:8888/todos

# java -jar
$ curl -X GET http://localhost:8972/todos

# 데이터 삽입
$ curl -X POST -H "Content-Type:application/json" -d '{"subject":"test0", "body":"test0", "completed":0}' http://localhost:8972/todos

# 데이터 수정
$ curl -X PUT -H "Content-Type:application/json" -d '{"subject":"test4", "body":"test4", "completed":0}' http://localhost:8972/todos/{id}

# 해당 데이터 삭제
$ curl -X DELETE http://localhost:8972/todos/{id}
```

### Reference Documentation
For further reference, please consider the following sections:

* [Official Gradle documentation](https://docs.gradle.org)
* [Spring Boot Gradle Plugin Reference Guide](https://docs.spring.io/spring-boot/3.3.4/gradle-plugin)
* [Create an OCI image](https://docs.spring.io/spring-boot/3.3.4/gradle-plugin/packaging-oci-image.html)
* [Spring Web](https://docs.spring.io/spring-boot/docs/3.3.4/reference/htmlsingle/index.html#web)
* [Thymeleaf](https://docs.spring.io/spring-boot/docs/3.3.4/reference/htmlsingle/index.html#web.servlet.spring-mvc.template-engines)
* [Spring Boot DevTools](https://docs.spring.io/spring-boot/docs/3.3.4/reference/htmlsingle/index.html#using.devtools)

### Guides
The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/rest/)
* [Handling Form Submission](https://spring.io/guides/gs/handling-form-submission/)

### Additional Links
These additional references should also help you:

* [Gradle Build Scans – insights for your project's build](https://scans.gradle.com#gradle)

