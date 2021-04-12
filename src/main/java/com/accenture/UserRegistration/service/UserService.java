package com.accenture.UserRegistration.service;

import java.util.List;

import com.accenture.UserRegistration.entity.User;

public interface UserService {

	public List<User> findAll();

	public User findById(int id);

	public void save(User user);

	public void delete(int id);
	
	public List<User> findByName(String name);
	
	public List<User> findByLastName(String name);
	
	public List<User> findByEmail(String email);
	
	public List<User> findByPhone(String phone_number);
}
