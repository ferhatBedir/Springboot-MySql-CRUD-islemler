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
       
<h2>Send Request</h2>

* When register user, you send database name.

* For Example : Request Body

      * {
           "userName" :"firstNameUser",
           "userLastName" : "LastNameUser",
           "databaseName" : "dbname"
       }
       
 * Address : http://localhost:8888/user/add
