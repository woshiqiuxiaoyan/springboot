
package com.yan.starter1;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/TestController3")
public class TestController3 {

    @RequestMapping("/")
    public String index() {

        System.out.print("----------------------------12312312----------------------------------");
        return "Greetings from Spring Boot!";
    }

}