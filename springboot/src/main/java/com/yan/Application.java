package com.yan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }




    @Bean
    public int helloWorld(){

        System.out.println("-======================================-");
        return 11;

    }


    @Bean
    public int helloWorld1(){

        System.out.println("1-======================================-");
        return 11;

    }
}
