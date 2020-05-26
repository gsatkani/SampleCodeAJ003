package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.dao.AdminDaoImpl;
import com.example.model.Admin;

@Controller
public class AdminLoginController {

	@Autowired
	public AdminDaoImpl adminDaoImpl;

	@GetMapping("/login")
	public ModelAndView adminLogin(@RequestParam("password") String password, @RequestParam("id") int id,
			ModelAndView model) {
		Admin adminLoginCheck = adminDaoImpl.adminLoginCheck(id, password);
		if (adminLoginCheck != null) {
			model.addObject("admin", adminLoginCheck);
			model.addObject("message", "Welcome to admin Home page");
			model.setViewName("admin-login-sucess");
		} else {
			model.addObject("message", "Login failed");
			model.setViewName("admin-login-error");
		}
		return model;

	}

}
