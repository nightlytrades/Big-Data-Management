# Lab 5

## Student information

* Full name: Amirreza Shirazi
* E-mail: ashir025@ucr.edu
* UCR NetID: ashir025
* Student ID: 862217190

## Answers

* (Q1) Do you think it will use your local cluster? Why or why not?

    No, it will not use the local cluster. That is because the application is not using the pseudo distributed mode yet.

* (Q2) Does the application use the cluster that you started? How did you find out?

    Yes, it uses the cluster. I refreshed the page and it shows the completed applications, and it also shows the name of my hdfs directory on my machine.

* (Q3) What is the Spark master printed on the standard output on IntelliJ IDEA?

    Output printed for Spark Master: Using Spark master 'local[*]'

* (Q4) What is the Spark master printed on the standard output on the terminal?

    Output printed for Spark Master: Using Spark master 'spark://127.0.0.1:7077'

* (Q5) For the previous command that prints the number of matching lines, list all the processed input splits.

  rdd.HadoopRDD: Input split: hdfs://localhost:9000/user/amir/nasa_19950801.tsv:1169610+1169610
  
  rdd.HadoopRDD: Input split: 
  hdfs://localhost:9000/user/amir/nasa_19950801.tsv:0+1169610

* (Q6) For the previous command that counts the lines and prints the output, how many splits were generated?

  Two splits were generated, total of 27972 lines. First file is 13856 lines and second file is 14116 lines.

* (Q7) Compare this number to the one you got earlier.
  
  The number of lines is slightly less than before.

* (Q8) Explain why we get these numbers.
  
  I believe that we had more empty lines before that is why the count for the lines were higher, compared to now.

* (Q9) What can you do to the current code to ensure that the file is read only once?

  By using the cache function, this way we persist this RDD with the default storage level (MEMORY_ONLY).