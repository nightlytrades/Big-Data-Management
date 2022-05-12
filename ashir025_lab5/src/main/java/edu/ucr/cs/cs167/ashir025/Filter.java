package edu.ucr.cs.cs167.ashir025;

import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;
import org.apache.spark.SparkConf;

public class Filter {
    public static void main( String[] args ) {

        final String inputfile = args[0];
        final String outputFile = args[1];
        final String desiredCode = args[2];

        SparkConf conf = new SparkConf();
        if (!conf.contains("spark.master"))
            conf.setMaster("local[*]");
        System.out.printf("Using Spark master '%s'\n", conf.get("spark.master"));
        conf.setAppName("lab5");
        try(JavaSparkContext spark = new JavaSparkContext(conf)) {
            JavaRDD<String> logFile = spark.textFile(inputfile);
            JavaRDD<String> matchingLines = logFile.filter(line -> line.split("\t")[5].equals(desiredCode));
            System.out.printf("The file '%s' contains %d lines with response code %s\n", inputfile, matchingLines.count(), desiredCode);
            matchingLines.saveAsTextFile(outputFile);
        }
    }
}

