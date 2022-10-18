package com.nichiporenko.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

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

//    @GetMapping("/logout")
//    public String logout(HttpServletRequest request, HttpServletResponse response) {
//        try {
//
//
//            Cookie[] cookies = request.getCookies();
//            for (Cookie cookie : cookies) {
//                if ("".equals(cookie.getName())) {
//
//                }
//            }
//            response.sendRedirect("");
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//
//    }
}
