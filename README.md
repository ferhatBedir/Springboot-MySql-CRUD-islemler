# Springboot-MySql-CRUD-islemler

<h2>Overview</h2>

 * Spring Boot is an opinionated, convention-over-configuration focused addition to the Spring platform – highly useful to get started with minimum effort and create stand-alone, production-grade applications. This tutorial is a starting point for Boot – a way to get started in a simple manner, with a basic web application.
 
 * In this application, insertion deletion reading and update operations are performed.
 
 <h2>How to run the application ?</h2>
 
 * You must have mysql installed on the computer.
 * Application is runing in localhost and port 8080 and default database name is ' springdeneme '.
 * The application.properties file is below. If your settings are different, change from the application.properties file.
 
       spring.datasource.url=jdbc:mysql://localhost:3306/springdeneme?useUnicode=true&characterEncoding=utf-8
       spring.datasource.username=root
       # Hibernate
       spring.jpa.show-sql=false
       spring.jpa.hibernate.ddl-auto=update
       server.port=8080
       
<h2>Send Post Request</h2>

* User add to Database

* For Example : Request Body

      * {
           "userFirstName" :"firstNameUser",
           "UserLastName" : "LastNameUser",
           "birthDate" : "date"
           "userEmail" : "mailaddress",
           "userDepartment" : "userdepartment"
       }
       
 * Address : http://localhost:8080/user/adduser
 
 <h2>Send Post Request</h2>

* User update to Database

* For Example : Request Body

      * {
           "userFirstName" :"firstNameUser",
           "UserLastName" : "LastNameUser",
           "birthDate" : "date"
           "userEmail" : "mailaddress",
           "userDepartment" : "userdepartment"
       }
       
 * Address : http://localhost:8080/user/updateuser
 
 <h2>Send Get Request</h2>

* For read user from database

* For Example :

      * http://localhost:8080/user/getuser?id=1
 
 <h2>Send Delete Request</h2>

* For delete user from database

* For Example : 

      * http://localhost:8080/user/getuser?id=1
  
<h2>Used Technologies</h2>
 * Java 8
 * Spring Boot
 * Mysql
 * Maven
 
