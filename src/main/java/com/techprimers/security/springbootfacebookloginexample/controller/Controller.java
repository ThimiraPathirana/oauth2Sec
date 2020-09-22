package com.techprimers.security.springbootfacebookloginexample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/not-restricted")
    public String notRestricted() {
        return "you don't need to be logged in";
    }

    @GetMapping("/restricted")
    public String restricted() {
        return "if you see this you are logged in";
    }
}
