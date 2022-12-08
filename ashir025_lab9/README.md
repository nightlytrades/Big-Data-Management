# Lab 9

## Student information

* Full name: Amirreza Shirazi
* E-mail: ashir025@ucr.edu
* UCR NetID: ashir025
* Student ID: 862217190

## Answers

* (Q1) What is the schema of the file after loading it as a Dataframe

    ```text
  |-- Timestamp: string (nullable = true)
  |-- Text: string (nullable = true)
  |-- Latitude: double (nullable = true)
  |-- Longitude: double (nullable = true)
    ```

* (Q2) Why in the second operation, convert, the order of the objects in the  tweetCounty RDD is (tweet, county) while in the first operation, count-by-county, the order of the objects in the spatial join result was (county, tweet)?

    ```text
   That is because here we are converting so order affects the spatial join result. 
   However before we were counting so the order was different.
    ```

* (Q3) What is the schema of the tweetCounty Dataframe?

    ```text
  |-- Timestamp: string (nullable = true)
  |-- Text: string (nullable = true)
  |-- Latitude: double (nullable = true)
  |-- Longitude: double (nullable = true)
  |-- geometry: geometry (nullable = true)
  |-- CountyID: string (nullable = true)
    ```

* (Q4) What is the schema of the convertedDF Dataframe?

    ```text
  |-- CountyID: string (nullable = true)
  |-- Longitude: double (nullable = true)
  |-- Latitude: double (nullable = true)
  |-- keywords: array (nullable = true)
  |    |-- element: string (containsNull = true)
  |-- Timestamp: string (nullable = true)
    ```

* (Q5) For the tweets_10k dataset, what is the size of the decompressed ZIP file as compared to the converted Parquet file?

    ```text
  | Size of the original decompressed file: 788,908 bytes | Size of the Parquet file: 515,401 bytes (size of convert_output, inside there is three part-00 files, 186,751 bytes, 141,187 bytes, 183,439 bytes respectively) |
    ```
* (Q6) (Bonus) Write down the SQL query(ies) that you can use to compute the ratios as described above. Briefly explain how your proposed solution works.

    ```SQL
    -- Enter the SQL query(ies) here
    ```

    ```text
    Use this space to explain how it works.
    ```
