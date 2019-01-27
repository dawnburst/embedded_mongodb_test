FROM adoptopenjdk/openjdk8
COPY . /
RUN mkdir -p root/.embedmongo/linux/ && \
    cp mongodb-linux-x86_64-3.5.5.tgz root/.embedmongo/linux/. && \
    chmod 777 root/.embedmongo/linux && \
    mkdir ~/tmp && \
    chmod 777 tmp && \
    chmod +x mvnw && \
    ./mvnw clean install && \
    cp target/*.jar /app.jar
ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "app.jar"]