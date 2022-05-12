#!/usr/bin/env sh
mvn clean package
spark-submit --class edu.ucr.cs.cs167.ashir025.AppSQL --master "local[*]" target/ashir025_lab6-1.0-SNAPSHOT.jar count-all nasa_19950801.tsv
spark-submit --class edu.ucr.cs.cs167.ashir025.AppSQL --master "local[*]" target/ashir025_lab6-1.0-SNAPSHOT.jar code-filter nasa_19950801.tsv 200
spark-submit --class edu.ucr.cs.cs167.ashir025.AppSQL --master "local[*]" target/ashir025_lab6-1.0-SNAPSHOT.jar time-filter nasa_19950801.tsv 807274014 807283738
spark-submit --class edu.ucr.cs.cs167.ashir025.AppSQL --master "local[*]" target/ashir025_lab6-1.0-SNAPSHOT.jar count-by-code nasa_19950801.tsv
spark-submit --class edu.ucr.cs.cs167.ashir025.AppSQL --master "local[*]" target/ashir025_lab6-1.0-SNAPSHOT.jar sum-bytes-by-code nasa_19950801.tsv
spark-submit --class edu.ucr.cs.cs167.ashir025.AppSQL --master "local[*]" target/ashir025_lab6-1.0-SNAPSHOT.jar avg-bytes-by-code nasa_19950801.tsv
spark-submit --class edu.ucr.cs.cs167.ashir025.AppSQL --master "local[*]" target/ashir025_lab6-1.0-SNAPSHOT.jar top-host nasa_19950801.tsv
spark-submit --class edu.ucr.cs.cs167.ashir025.AppSQL --master "local[*]" target/ashir025_lab6-1.0-SNAPSHOT.jar comparison nasa_19950801.tsv 807295758


