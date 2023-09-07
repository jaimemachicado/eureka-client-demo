package com.eureka.demo.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

  @GetMapping(value = "/hello")
  public ResponseEntity<String> getMessage() {
    return ResponseEntity.ok("Hello from eureka client");
  }
}
