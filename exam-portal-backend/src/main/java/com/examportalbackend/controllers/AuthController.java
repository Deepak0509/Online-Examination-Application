package com.examportalbackend.controllers;

import com.examportalbackend.models.LoginRequest;
import com.examportalbackend.models.LoginResponse;
import com.examportalbackend.models.User;
import com.examportalbackend.services.AuthService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins="*", exposedHeaders="**")
@RestController
@RequestMapping("/api")
public class AuthController {

    @Autowired
    AuthService authService;


    @PostMapping("/register")
    public User registerUser(@RequestBody User user) throws Exception {
        return authService.registerUserService(user);
    }

    @PostMapping("/login")
    public LoginResponse loginUser(@RequestBody LoginRequest loginRequest) throws Exception {
        return authService.loginUserService(loginRequest);
    }

}
