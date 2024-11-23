package com.example.expt17;

import org.springframework.web.bind.annotation.GetMapping;
import org. springframework.web.bind. annotation. RestController;

@RestController
public class MyController {
    @GetMapping("/")

    public String show1() {
        return ("<h1> hello world! </h1>");
    }
}