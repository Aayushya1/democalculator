FROM openjdk
COPY target/democalc-1.0-SNAPSHOT.jar /home
WORKDIR /home
CMD ["java" , "-jar" , "democalc-1.0-SNAPSHOT.jar"]