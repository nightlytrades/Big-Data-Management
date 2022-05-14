#!/usr/bin/env sh
mvn clean package
java -cp target/ashir025_lab3-1.0-SNAPSHOT.jar edu.ucr.cs.cs167.ashir025.AppC 3 20 5
java -cp target/ashir025_lab3-1.0-SNAPSHOT.jar edu.ucr.cs.cs167.ashir025.AppD 3 20 3^5
java -cp target/ashir025_lab3-1.0-SNAPSHOT.jar edu.ucr.cs.cs167.ashir025.AppD 3 20 3v5
