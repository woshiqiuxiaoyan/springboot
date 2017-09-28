
package com.yan.starter;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController1 {

    @RequestMapping("/first")
    public String index() {

        System.out.print("----------------------------12312312----------------------------------");
        return "Greetings from Spring Boot!";
    }

}