# Lab 4

## Student information

* Full name: Amirreza Shirazi
* E-mail: ashir025@ucr.edu
* UCR NetID: ashir025
* Student ID: 862217190

## Answers

* (Q1) What do you think the line `job.setJarByClass(Filter.class);` does?

  Here we tell hadoop which jar it should send to nodes to perform Map and Reduce tasks.

* (Q2) What is the effect of the line `job.setNumReduceTasks(0);`?

  This line is setting the number of reducers to 0 so it a map only job.

* (Q3) Where does the `main` function run? (Driver node, Master node, or an executor node).

  In the Master Node.

* (Q4) How many lines do you see in the output?

    27972 lines
* (Q5) How many files are produced in the output?

  There is only one file produced in the filter_output.csv directory,
  named part-m-00000 which contains the output data.

* (Q6) Explain this number based on the input file size and default block size.

  Input split bytes=129

  File Input 
  Bytes Read=2339220

  File Output 
  Bytes Written=2143985

* (Q7) How many files are produced in the output?

  There is only one file produced in the filter_output.csv directory, 
  named part-m-00000 which contains the output data.

* (Q8) Explain this number based on the input file size and default block size.
  
  Input split bytes=129

  File Input
  Bytes Read=2339220

  File Output
  Bytes Written=2143985

* (Q9) How many files are produced in the output directory and how many lines are there in each file?

  Two files are produced in the output directory:
  part-r-00000: 4 lines, and part-r-00001: 0 lines.

* (Q10) Explain these numbers based on the number of reducers and number of response codes in the input file.

  The number of the reducers is 2, which is equal to the number of lines with non 0 values.
  There is also 4 different response codes in the file, which is equal to the total number of lines.
* (Q11) How many files are produced in the output directory and how many lines are there in each file?

  Two files are produced in the output directory:
  part-r-00000: 5 lines, and part-r-00001: 2 lines.

* (Q12) Explain these numbers based on the number of reducers and number of response codes in the input file.

  The number of the reducers is 2, which is equal to the number of lines with non 0 values.
  There is also 7 different response codes in the file, which is equal to the total number of lines.

* (Q13) How many files are produced in the output directory and how many lines are there in each file?
  
  Two files are produced in the output directory:
  part-r-00000: 1 lines, and part-r-00001: 0 lines.

* (Q14) Explain these numbers based on the number of reducers and number of response codes in the input file.

  Here we are just selecting response code 200, so we only get output for that response code, 
  therefore we only use 1 reducer, and we have 1 line of output.