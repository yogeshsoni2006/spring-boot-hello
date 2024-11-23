package com.example.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class HelloController {
    @GetMapping("/hello/{name}")
    public String hello(@PathVariable String name) {
      log.info("Hello request for- {}", name);
      return "Hello request for- " + name;
    }
}
