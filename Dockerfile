FROM openjdk:17

ADD target/doctorscheduleservice.jar doctorscheduleservice.jar

ENTRYPOINT [ "java" , "-jar" , "/doctorscheduleservice.jar" ]