

FROM maven:3.8.2-openjdk-11 AS MAVEN_BUILD 
COPY pom.xml /build/
COPY src /build/src/
WORKDIR /build/
RUN mvn -DskipTests=true package

FROM openjdk:11-jdk
WORKDIR /app
COPY --from=MAVEN_BUILD /build/target/*.jar /app/buchungsService.jar
COPY apm-agent.jar /app/apm-agent.jar 

EXPOSE 8080

CMD ["java","-javaagent:apm-agent.jar", "-Delastic.apm.service_name=my-cool-service -Delastic.apm.application_packages=main.java -Delastic.apm.server_urls=http://apm-server:8200","-jar", "buchungsService.jar"]