FROM eclipse-temurin:17-jre-jammy

COPY build/libs/*.jar /opt/app/application.jar

RUN addgroup --system spring && adduser --system --ingroup spring spring
USER spring:spring

CMD java -jar /opt/app/application.jar
