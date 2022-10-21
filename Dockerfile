FROM gradle:jdk8 as build
COPY . /app
WORKDIR /app
RUN gradle build -x test

FROM openjdk:8-jdk-alpine
EXPOSE 8080
COPY --from=build /app/build/libs/updoot-0.0.1-SNAPSHOT.jar /app/app.jar
WORKDIR /app
ENTRYPOINT ["java","-jar","app.jar"]