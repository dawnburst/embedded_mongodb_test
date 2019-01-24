FROM java:openjdk-8-alpine
VOLUME /tmp
COPY . /
RUN chmod +x mvnw && \
    ./mvnw clean install && \
    cp target/*.jar /app.jar
ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "app.jar"]