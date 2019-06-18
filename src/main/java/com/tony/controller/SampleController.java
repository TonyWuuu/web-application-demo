package com.tony.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@EnableAutoConfiguration
public class SampleController {
    @RequestMapping("/greeting")
    public String greeting() {
        return "greeting.html";
    }

    @GetMapping("/jsp")
    public String jspPage(Model model,@RequestParam String name) {
        model.addAttribute("name", name);
        return "jsp/sample";
    }

    @GetMapping("/thymeleaf")
    public String thymeleafPage(Model model,@RequestParam String name) {
        model.addAttribute("name", name);
        return "thymeleaf/sample";
    }

}
