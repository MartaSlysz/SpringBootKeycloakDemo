package com.example.SpringBootKeycloakDemo.controllers;

import com.example.SpringBootKeycloakDemo.model.User;
import com.example.SpringBootKeycloakDemo.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/register")
public class RegistrationController {

    private final UserRepository userRepository;

    @Autowired
    public RegistrationController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @PostMapping
    public String processRegistration(String username, String password){
        User user = new User(username, password);
        userRepository.save(user);
        return "";
    }

}
