package com.ivandjoh.myspringdb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyApp {

    public static void main(String[] args) {
        SpringApplication.run(MyApp.class, args);
    }

    // Create Bean
//    @Bean
//    CommandLineRunner commandLineRunner(JdbcConnectionDetails jdbc) {
//        return args -> {
//            System.out.println("JDBC URL: " + jdbc.getJdbcUrl());
//            System.out.println("JDBC Username: " + jdbc.getUsername());
//            System.out.println("JDBC Password: " + jdbc.getPassword());
//        };
//    }
}
