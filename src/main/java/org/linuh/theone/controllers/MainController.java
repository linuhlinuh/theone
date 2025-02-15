package org.linuh.theone.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {


    @GetMapping("/test")
    public String main() {
        return "hello";
    }
}
