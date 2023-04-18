package com.kpmg.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kpmg.entities.User;
import com.kpmg.repositories.UserRepository;

@Controller
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @RequestMapping("/")
    public String home(Model model) {
        model.addAttribute("user", new User());
        return "index";
    }
    

    @PostMapping("/register")
    public String register(@Validated User user, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "register";
        }
        userRepository.save(user);
        return "redirect:/login";
    }
    
    

}
