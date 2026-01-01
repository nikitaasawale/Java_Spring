package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.Model.User;
import com.Service.Homeservice;

@Controller
public class HomeController {
	
	
	
	@Autowired//IOC object
	public Homeservice homeservice;
	
	@RequestMapping("/log")
	public String getLoginDetails(@RequestParam("un") String username,@RequestParam("ps") String password,Model model) {
		
		System.out.println("Backend log call");
		System.out.println("UserName:"+username);
		System.out.println("Password:"+password);
		List<User> listofuser=homeservice.login();
		System.out.println(listofuser);
		model.addAttribute("users", listofuser);
		return "admin";
	}
	@RequestMapping("/reg")
	public String getregistrationDetails(@ModelAttribute User user) {
		System.out.println("I am in controller layer");
		System.out.println("Register data API::"+user);
		homeservice.registerDataInService(user);
		return "login";
	}
	@RequestMapping("/getAllUser")
	public String getAllUser(Model model) {
		
		List<User> listofuser=homeservice.getAllUsers();
		model.addAttribute("users",listofuser);
		return "admin";
		
	}
	@RequestMapping("/deleteUser")
	public String deleteUser(@RequestParam("userId") int id) {
		
		homeservice.deleteUserService(id);
		return "redirect:/getAllUser";
		
	}
	@RequestMapping("/editUser")
	public String editUser(@RequestParam("userId") int id,Model model) {
		User user=homeservice.getUserService(id);
		model.addAttribute("user",user);
		return "editUser";
		
		
	}
	@RequestMapping("/updateUser")
	public String updateUser(@ModelAttribute User user) {
		homeservice.updateUserService(user);
		return "redirect:/getAllUser";
	}
}
