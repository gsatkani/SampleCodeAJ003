package com.example.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.dao.UserDaoImpl;
import com.example.model.User;

@Controller
@ComponentScan("com.example.dao")
public class UserController {

	@Autowired
	public UserDaoImpl daoImpl;

	@PostMapping("/addUserDetail")
	public String addUserDetial(@ModelAttribute("username") User user, Model model) {
		System.out.println("->" + user);
		boolean insertUserDetail = daoImpl.insertUserDetail(user);
		if (insertUserDetail) {
			model.addAttribute("message", "User Inserted Successfully");
			return "display-page";
		}
		return "error-page";
	}

	@GetMapping("/getAllUserDetail")
	public String getAllUserDetail(Model model) {
		List<User> allUserDetails = daoImpl.getAllUserDetails();
		System.out.println(allUserDetails);
		model.addAttribute("userlist", allUserDetails);
		return "user-list-all";

	}
	//http://localhost:4000/deleteUser/123 123=id
	@RequestMapping("/deleteUser/{id}")
	public String deleteUserById(Model model,@PathVariable("id") int userid) {
		System.out.println("User id to delete" + userid);
		boolean deleteByUserId = daoImpl.deleteByUserId(userid);
		if(deleteByUserId) {
			model.addAttribute("message", "User Deleted Successfully");
			return "display-page";
		}
		return "error-page";
		
	}
	
	//http://localhost:4000/editUser/1
	@GetMapping("/editUser/{id}")
	public String getUserByID(@PathVariable("id") int userId,Model model){
		User user = daoImpl.getUserById(userId);
		if(user!=null) {
			model.addAttribute("user", user);
			return "edit-user-page";
		}
		return "error-page";
		
	}
	
	//http://localhost:4000/editUser/updateUserDetail?id=15&name=AA&mobile=95662588	
	@RequestMapping("/updatUserDetail")
	public String updateUserDetail(@ModelAttribute("user") User user,Model model) {
		System.out.println("inside controller " + user);
		boolean update = daoImpl.updateUserById(user);
		if(update) {
			model.addAttribute("message", "User Updated Successfully");
			return "display-page";
		}
		return "error-page";
	}
		
}
