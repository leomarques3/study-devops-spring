FROM gradle:6.9.0-jdk11

ARG PROJECT_NAME="study-devops-spring"
ARG PROJECT_VERSION
ENV PROJECT=${PROJECT_NAME}-${PROJECT_VERSION}.jar

WORKDIR /opt/${PROJECT_NAME}/
COPY ./ ./

RUN gradle clean build -Pversion=${PROJECT_VERSION}
RUN mv ./build/libs/${PROJECT} /opt/${PROJECT_NAME}/

EXPOSE 8080

CMD ["sh", "-c", "java -jar ${PROJECT}"]