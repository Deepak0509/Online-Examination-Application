package com.kpmg.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kpmg.entities.User;
import com.kpmg.services.UserService;

@Controller
public class RegistrationController {
    
    @Autowired
    private UserService userService;
    
    
    @RequestMapping("/register")
    public String showRegistrationPage(Model model) {
        model.addAttribute("user", new User());
        return "register";
    }
    
    
    
//    @PostMapping("/register")
//    public String register(@ModelAttribute("user") User user, Model model) {
//        User existingUser = userService.findByEmail(user.getEmail());
//        if (existingUser != null) {
//            model.addAttribute("error", "User with this email already exists");
//            return "register";
//        }
//        
//        // save user to database and redirect to login page
//        userService.save(user);
//        return "redirect:/login";
//    }
    
}

