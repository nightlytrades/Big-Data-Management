#!/usr/bin/env sh
mvn clean package
yarn jar target/ashir025_lab4-1.0-SNAPSHOT.jar edu.ucr.cs.cs167.ashir025.Filter hdfs:///nasa_19950801.tsv hdfs:///filter_output.tsv 200
yarn jar target/ashir025_lab4-1.0-SNAPSHOT.jar edu.ucr.cs.cs167.ashir025.Aggregation hdfs:///filter_output.tsv hdfs:///aggregation_output.tsv