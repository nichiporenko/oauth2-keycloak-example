package com.nichiporenko.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String showHome(Model model) {

        return "home";
    }

    @GetMapping("/data")
    public String showData(Model model) {

        return "data";
    }
}
