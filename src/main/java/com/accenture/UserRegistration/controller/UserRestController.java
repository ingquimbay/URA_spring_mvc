package com.accenture.UserRegistration.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.accenture.UserRegistration.entity.User;
import com.accenture.UserRegistration.service.UserService;

@RestController
@RequestMapping("/api")
public class UserRestController {

	private UserService userservice;

	@Autowired
	public UserRestController(UserService userservice) {
		super();
		this.userservice = userservice;
	}

	@GetMapping("/users")
	public List<User> findAll() {
		return userservice.findAll();
	}

	@GetMapping("/users/{userId}")
	public User getUser(@PathVariable int userId) {
		User user = userservice.findById(userId);
		if (user == null) {
			throw new RuntimeException("User does not exist");
		}
		return user;
	}
	
	@GetMapping("/users/first_name")
	public List<User> findByName(@RequestParam(value="name") String name) {
		return userservice.findByName(name);
	}
	
	@GetMapping("/users/last_name")
	public List<User> findByLastName(@RequestParam(value="name") String name) {
		return userservice.findByLastName(name);
	}
	
	@GetMapping("/users/email")
	public List<User> findByEmail(@RequestParam(value="email") String email) {
		return userservice.findByEmail(email);
	}
	
	@GetMapping("/users/phone")
	public List<User> findByPhone(@RequestParam(value="phone") String phone) {
		return userservice.findByPhone(phone);
	}

	@PostMapping("/users")
	public User addUser(@RequestBody User user) {
		// set id to 0 when saving new object
		user.setId(0);
		userservice.save(user);
		return user;
	}

	@PutMapping("/users/{userId}")
	public User updateUser(@RequestBody User user) {
		userservice.save(user);
		return user;
	}
	
	@DeleteMapping("/users/{userId}")
	public String deleteUser(@PathVariable int userId) {
		User user = userservice.findById(userId);
		if (user == null) {
			throw new RuntimeException("User does not exist");
		}
		userservice.delete(userId);
		return "Deleted user: " + userId;
	}
}
