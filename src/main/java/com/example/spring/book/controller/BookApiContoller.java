package com.example.spring.book.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookApiContoller {
    @GetMapping("/")
    public String ok(){
        return "ok";
    }
}
