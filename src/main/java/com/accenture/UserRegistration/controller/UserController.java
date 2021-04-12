package com.accenture.UserRegistration.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.accenture.UserRegistration.entity.User;
import com.accenture.UserRegistration.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {

	public UserService userserv;

	@Autowired
	public UserController(UserService userserv) {
		super();
		this.userserv = userserv;
	}

	@GetMapping("/list")
	public String listUsers(Model model) {

		model.addAttribute("usersList", userserv.findAll());

		return "list-users";
	}

	@GetMapping("/addUser")
	public String addUser(Model model) {

		User user = new User();

		model.addAttribute("user", user);

		return "user-form";
	}

	@PostMapping("/save")
	public String saveUser(@ModelAttribute("user") User user) {
		// save user
		userserv.save(user);
		// prevent duplicate submissions and returns to main list
		return "redirect:/user/list";
	}

	@GetMapping("/updateUser")
	public String updateUser(@RequestParam("userId") int userId, Model model) {

		User user = userserv.findById(userId);

		model.addAttribute("user", user);

		return "user-form";
	}
	
	@GetMapping("/deleteUser")
	public String deleteUser(@RequestParam("userId") int userId) {

		userserv.delete(userId);

		return "redirect:/user/list";
	}
}
