package com.example.expt19;

import org. springframework.web.bind. annotation. GetMapping;
import org. springframework.web. bind. annotation. RestController;

@RestController
public class MyController {
    @GetMapping("/")
    public String show1() {
        return ("<h1> hello world! </h1>");
    }
    @GetMapping("/user")
    public String show2() {
        return ("<h1> hello welcome to USER PAGE! </h1>");
    }

    @GetMapping("/admin")
    public String show3() {
        return ("<h1> hello welcome to ADMIN PAGE! </h1>");
    }


}
