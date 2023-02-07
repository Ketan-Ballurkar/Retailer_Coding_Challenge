# Retailer_Coding_Challenge

Problem:

A retailer offers a rewards program to its customers awarding points based on each recorded
purchase as follows:
 
For every dollar spent over $50 on the transaction, the customer receives one point.
In addition, for every dollar spent over $100, the customer receives another point.
Ex: for a $120 purchase, the customer receives
(120 - 50) x 1 + (120 - 100) x 1 = 90 points
Given a record of every transaction during a three-month period, calculate the reward points
earned for each customer per month and total.
------------------------------------------------------------------------------------------------

The Project title is : Retailer-Coding-Challenge

- There are sub - packages in the project which have controllers, service, dao, entity under the main or the root package com.luv2code.springboot.retailercoding

-  Inorder to run the project, in the main package there is a java file called RetailerCodingChallenge.java, so RIGHT-CLICK ON IT and "click run as java".

- The Project will start and in the URL type : localhost:8080/retail/rewards/ to get the list all the customers and their transactions, similarly, if you want to get the retrive the list of customer's transaction by id then type in the URL : localhost:8080/retail/rewards/{id no} and then you get the customer details by id.

- The controller in the com.luv2code.springboot.retailcoding.controller package, returns the list of customers and their transactions based on the URL call.

- The entity in the com.luv2code.springboot.retailcoding.entity package, maps with the table in the database which is MYSQL WORKBENCH and the name of the table is : "customers_and_transactions_list"

- In the application.properties file under src/main/resources/, there is details of the datasource.url, datasource.username and datasource.password, you will have to modify based on the database and the username and password you have set.

- In the src/main/resources/, there is a folder called "templates", which contains two html files (they are - ListOfCustomersandTransactions.html and ListOfCustomersandTransactionsById.html) which I have used for front-end of the application using Thmyeleaf for depicting the list of customers and their transactions to the user.

- Attached are the screenshots for reference.


<img width="960" alt="2023-02-06 (2)" src="https://user-images.githubusercontent.com/115998491/217314876-d910a5fb-2369-45da-9610-d2a037ff8384.png">
<img width="960" alt="2023-02-06 (3)" src="https://user-images.githubusercontent.com/115998491/217314894-3a002b38-cc6d-4a14-ab27-cd7b22760d8b.png">
<img width="960" alt="2023-02-06" src="https://user-images.githubusercontent.com/115998491/217314910-2bd3be30-3f91-4095-9c19-9dd559061a89.png">
