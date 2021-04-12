package com.accenture.UserRegistration.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.accenture.UserRegistration.dao.UserRepository;

@Controller
@RequestMapping("/jpa")
public class UserJPAController {

	@Autowired
	private UserRepository userrepo;

	@GetMapping("/users")
	public String getAllUsers(Model m) {
		m.addAttribute("usersList", userrepo.findAll());
		return "list-users";
	}

}
