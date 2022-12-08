# Lab 7

## Student information

* Full name: Amirreza Shirazi
* E-mail: ashir025@ucr.edu
* UCR NetID: ashir025
* Student ID: 862217190

## Answers

* (Q1) What is your command?

    ```shell
    mongoimport --collection=contacts --jsonArray /Users/amir/Desktop/contacts.json 
    ```

* (Q2) What is the output of the above command?

    ```text
    2022-05-18T19:58:14.702-0700	connected to: mongodb://localhost/
    2022-05-18T19:58:14.737-0700	10 document(s) imported successfully. 0 document(s) failed to import.
    ```

* (Q3) What is your command?

    ```shell
    > db.contacts.find().sort({Name:1})
    ```

* (Q4) What is your command?

    ```shell
    > db.contacts.find({},{Name:1}).sort({Name:-1})
    ```

* (Q5) Is the comparison of the attribute `Name` case-sensitive?

  Yes it is case sensitive. I added "apple","Berry","Apple" and "berry" and I noticed that the 
  words that start with lower case letter are at the end of the list.

* (Q6) What is your command?

    ```shell
    > db.contacts.find({},{Name:1, _id:0}).sort({Name:-1})
    ```

* (Q7) Does MongoDB accept this document while the `Name` field has a different type than other records?
  
  Yes, it says acknowledged: true.
  

* (Q8) What is your command?

    ```shell
  > db.contacts.insertOne({Name: {First: "David", Last: "Bark"}})
    ```

* (Q9) What is the output of the above command?

    ```text
  {
  "acknowledged" : true,
  "insertedId" : ObjectId("6285c41d380f8808e42d39b0")
  }
    ```

* (Q10) Where do you expect the new record to be located in the sort?

  I expected for it to be located in the Fifth position from the bottom, however it is located on the last position from the bottom, which is top.

* (Q11) What is your command?

    ```shell
    > db.contacts.insertOne({Name: ["David", "Bark"]})
    ```

* (Q12) What is the output of the above command?

    ```text
  {
  "acknowledged" : true,
  "insertedId" : ObjectId("6285c259380f8808e42d39af")
  }
    ```

* (Q13) Where do you expect the new document to appear in the sort order. Verify your answer and explain after running the query.

  I expected Fifth position and it is in the Fifth position from the bottom. 

* (Q14) Where do you expect the last inserted record, `{Name: ["David", "Bark"]}` to appear this time? Does it appear in the same position relative to the other records? Explain why or why not.

  I expected Fifth position however it is in the Third position from the top. That is because the format for Name is not correct.

* (Q15) Is MongoDB able to build the index on that field with the different value types stored in the `Name` field?

  Yes.

* (Q16) What is your command?

    ```shell
    > db.contacts.createIndex({"Name":1},{})
    ```

* (Q17) What is the output of the above command?

    ```text
    {
	"numIndexesBefore" : 1,
	"numIndexesAfter" : 2,
	"createdCollectionAutomatically" : false,
	"ok" : 1
  }
    ```
