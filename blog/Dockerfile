FROM adoptopenjdk/openjdk11:alpine-jre

COPY ./target/blog.jar /usr/app/

WORKDIR /usr/app

ENTRYPOINT ["java","-jar","blog.jar"]
