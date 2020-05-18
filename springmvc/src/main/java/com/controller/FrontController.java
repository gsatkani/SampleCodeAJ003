package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FrontController {

	@RequestMapping("/home")
	public String getHomePage() {
		return "home"; // home.jsp will be searched inside view folder
	}
	
	@RequestMapping("/admin")
	public String getAdminHomePage() {
		return "admin"; //admin.jsp will be searched inside view folder
	}
	
	@RequestMapping("/")
	public String getPage() {
		return "index"; //index.jsp will be searched inside view folder
	}
}
