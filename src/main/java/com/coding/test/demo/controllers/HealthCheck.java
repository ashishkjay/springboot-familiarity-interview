package com.coding.test.demo.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

@CrossOrigin
@RestController
public class HealthCheck {
    @ResponseBody
    @GetMapping(value = "/health")
    public ResponseEntity<String> statusCheck(HttpServletResponse response) {
        String msg = "200 OK";
        return new ResponseEntity<>(msg, HttpStatus.OK);
    }
}
