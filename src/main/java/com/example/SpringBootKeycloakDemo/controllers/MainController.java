package com.example.SpringBootKeycloakDemo.controllers;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.nio.file.attribute.UserPrincipal;

@Controller
public class MainController {

    @GetMapping(path = "/")
    public String getWelcomePage(){
        return "index.html";
    }


    @GetMapping("/users")
    public String home (Model model, Authentication auth) {
        if (auth != null && auth instanceof UserPrincipal) {
            UserPrincipal userPrincipal = (UserPrincipal) auth.getPrincipal();
            model.addAttribute("user", userPrincipal.getName());
        }

        return "home";
    }
}
