package com.playspring.backend.controllers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

@Controller
public class HomeController {

    @GetMapping("/")
    @ResponseBody
    public String getMethodName() {
        return "What Up nigga";
    }

    @GetMapping("/getParams")
    @ResponseBody
    public String getMethodName(CParms param) {
        return "Get Params " + param.getA() + " " + param.getB();
    }

    @GetMapping("/namedParams/{a}")
    @ResponseBody
    public String namedVariable(@PathVariable("a") String a) {
        return "Get Params " + a;
    }

    @PostMapping("/postParams")
    @ResponseBody
    public String postMethodName(CParms param) {
        return "Post Params " + param.getA() + " " + param.getB();
    }

    @GetMapping("/json")
    @ResponseBody
    public Map<String, Object> heyJson() {
        Map<String, Object> response = new HashMap<>();
        response.put("name", "John Doe");

        List list = new ArrayList<>();
        list.add("Terminator");
        list.add("Black Hawk Down");

        response.put("Movies", list);

        return response;
    }

    @GetMapping("/theme")
    public String theme(Model model) {
        model.addAttribute("name", "Mokbul");
        return "welcome";
    }

}