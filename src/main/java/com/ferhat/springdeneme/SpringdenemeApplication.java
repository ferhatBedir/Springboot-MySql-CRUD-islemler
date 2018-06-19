package com.ferhat.springdeneme;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringdenemeApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringdenemeApplication.class, args);

        /*
        --- Kendi Pc'mdeki mySql bilgileri
        spring.datasource.url=jdbc:mysql://localhost:3306/springdeneme?useUnicode=true&characterEncoding=utf-8
        spring.datasource.username=root
        # Hibernate
        spring.jpa.show-sql=false
        spring.jpa.hibernate.ddl-auto=update
        server.port=8080
         */

    }
}
