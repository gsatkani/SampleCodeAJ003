package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.model.User;

@Controller
public class HelloController {

	@RequestMapping("/")
	public String getIndexPage() {
		return "index";
	}

	@RequestMapping("/adminlogin")
	public String getAdminPage() {
		return "admin-login-page";
	}

	@RequestMapping("/userlogin")
	public String getUserPage(@ModelAttribute("username") User user) {
		return "user-login-page";
	}

	@GetMapping("/getData")
	public String displayPage(@RequestParam("username") String name,@RequestParam("password") String password,
			                                              Model model) {
		model.addAttribute("username",name);
		model.addAttribute("password",password);
		return "display-page";
	}

}
