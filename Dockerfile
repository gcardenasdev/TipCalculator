FROM openjdk:17
EXPOSE 3000
ADD target/tip-calculator.jar tip-calculator.jar
ENTRYPOINT ["java", "-jar", "/tip-calculator.jar"]
