package com.boot.main.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.boot.main.model.User;

@Controller
public class HomeController {
	List<User>ul=new ArrayList<>();
	@RequestMapping(value = "/")
	public String preLogin() {
		return "login";
	}
	
	@RequestMapping(value = "/register")
	public String preRegister() {
		return "register";
	}
	
	@RequestMapping(value = "/save")
	public String register(@ModelAttribute User u) {
		ul.add(u);
		System.out.println(ul);
		return "login";
	}
	
	@RequestMapping(value = "/login")
	public String postLogin(@RequestParam String username,@RequestParam String password,Model m) {
		if(username.equals("ADMIN") && password.equals("ADMIN")) {
			m.addAttribute("data", ul);
			
		return "success";
	}
		else {
		return "login";
	}
	}
	

}
