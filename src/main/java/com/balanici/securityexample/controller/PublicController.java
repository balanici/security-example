package com.balanici.securityexample.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/public")
public class PublicController {

    @GetMapping("/hello")
    public ResponseEntity<String> getHello() {
        String response = "Hello";
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
