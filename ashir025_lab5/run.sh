#!/usr/bin/env sh
mvn clean package
spark-submit --class edu.ucr.cs.cs167.ashir025.Filter target/ashir025_lab5-1.0-SNAPSHOT.jar hdfs:///nasa_19950630.22-19950728.12.tsv file:///filter_output 302
spark-submit --class edu.ucr.cs.cs167.ashir025.Aggregation target/ashir025_lab5-1.0-SNAPSHOT.jar hdfs:///nasa_19950630.22-19950728.12.tsv aggregation_output