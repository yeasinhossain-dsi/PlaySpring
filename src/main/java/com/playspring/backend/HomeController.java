package com.playspring.backend;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String getMethodName() {
        return "What Up nigga";
    }

    @GetMapping("/getParams")
    public String getMethodName(CParms param) {
        return "Get Params " + param.getA() + " " + param.getB();
    }

    @PostMapping("/postParams")
    public String postMethodName(CParms param) {
        return "Post Params " + param.getA() + " " + param.getB();
    }

}