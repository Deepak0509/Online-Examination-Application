package com.kpmg.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/index")
    public String index() {
    	return "index";
    }
    
    @RequestMapping("/userdashboard")
    public String userdashboard() {
    	return "userdashboard";
    }
    
    @RequestMapping("/admindashboard")
    public String admindashboard() {
    	return "admindashboard";
    }
    
    @RequestMapping("/userdashboard-myprofile") 
    public String userdashboardmyprofile() {
    	return "userdashboard-myprofile";
    }
}
