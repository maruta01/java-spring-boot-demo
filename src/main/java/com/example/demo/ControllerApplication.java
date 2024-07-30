package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ControllerApplication {

    @RequestMapping("/")
    public ResponseEntity<?> Hello(){
        return ResponseEntity.status(HttpStatus.OK).body("Hello, Java Spring Boot");
    }
}
