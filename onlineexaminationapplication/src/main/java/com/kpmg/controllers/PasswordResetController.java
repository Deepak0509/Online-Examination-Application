package com.kpmg.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.kpmg.entities.User;
import com.kpmg.services.UserService;

@Controller
public class PasswordResetController {
    
    @Autowired
    private UserService userService;
    
    @GetMapping("/forgot-password")
    public String showForgotPasswordPage(Model model) {
        model.addAttribute("user", new User());
        return "forgot-password";
    }
    
    @PostMapping("/forgot-password")
    public String sendResetLink(@ModelAttribute("user") User user, Model model) {
        User existingUser = userService.findByEmail(user.getEmail());
        if (existingUser == null) {
            model.addAttribute("error", "User not found");
            return "forgot-password";
        }
        
        // send password reset link to user's email
        // ...
        
        return "redirect:/login";
    }
    
    @GetMapping("/reset-password")
    public String showResetPasswordPage(@RequestParam("token") String token, Model model) {
        // validate token and show reset password form
        // ...
        
        model.addAttribute("user", new User());
        return "reset-password";
    }
    
    @PostMapping("/reset-password")
    public String resetPassword(@ModelAttribute("user") User user, Model model) {
        User existingUser = userService.findByEmail(user.getEmail());
        if (existingUser == null) {
            model.addAttribute("error", "User not found");
            return "reset-password";
        }
        
        existingUser.setPassword(user.getPassword());
        userService.save(existingUser);
        
        return "redirect:/login";
    }
    
}

