package com.gl.app.Controller;



import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @GetMapping("/hello")
    public String sayHello() {
        System.out.println("yoyoyoyo");
        return "Hello, World!";

    }
}
