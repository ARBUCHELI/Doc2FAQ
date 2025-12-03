package com.doc2faq.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("title", "Doc2FAQ");
        model.addAttribute("description", "Transform your documents into comprehensive FAQ formats with ease");
        return "index";
    }
}