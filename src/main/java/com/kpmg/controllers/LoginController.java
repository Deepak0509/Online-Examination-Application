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
public class LoginController {
    
    @Autowired
    private UserService userService;
    
    @RequestMapping("/login")
    public String showLoginPage(Model model) {
        model.addAttribute("user", new User());
        return "login";
    }
    
    @PostMapping("/login")
    public String login(@ModelAttribute("user") User user, Model model) {
    	
        User existingUser = userService.findByEmail(user.getEmail());
        
        if (existingUser == null) {
            model.addAttribute("error", "User not found");
            return "login";
        }
        
        if (!existingUser.getPassword().equals(user.getPassword())) {
            model.addAttribute("error", "Incorrect password");
            return "login";
        }
        
        // set user session and redirect to dashboard
        return "redirect:/dashboard";
    }
    
}


