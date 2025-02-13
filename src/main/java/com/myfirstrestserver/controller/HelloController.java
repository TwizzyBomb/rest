package com.myfirstrestserver.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("api")
public class HelloController {
  
  
  @GetMapping("/hello")
  public ResponseEntity<String> helloWorld(@RequestParam String name){
    try{
      return ResponseEntity.ok("hello " + name + "!");
    } catch (Exception e){
      // Handle the exception and return an error response
      String errorMessage = "Failed" + e.getMessage();
      return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(errorMessage);
    }
  }
}
