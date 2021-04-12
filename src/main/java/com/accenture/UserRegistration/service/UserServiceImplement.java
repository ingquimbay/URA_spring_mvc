package com.accenture.UserRegistration.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accenture.UserRegistration.dao.UserDAO;
import com.accenture.UserRegistration.entity.User;

@Service
public class UserServiceImplement implements UserService {

	private UserDAO userdao;

	@Autowired
	public UserServiceImplement(UserDAO userdao) {
		super();
		this.userdao = userdao;
	}

	@Override
	@Transactional
	public List<User> findAll() {
		return userdao.findAll();
	}

	@Override
	@Transactional
	public User findById(int id) {
		return userdao.findById(id);
	}

	@Override
	@Transactional
	public void save(User user) {
		userdao.save(user);
	}

	@Override
	@Transactional
	public void delete(int id) {
		userdao.delete(id);
	}

	@Override
	public List<User> findByName(String name) {
		return userdao.findByName(name);
	}

	@Override
	public List<User> findByLastName(String name) {
		return userdao.findByLastName(name);
	}

	@Override
	public List<User> findByEmail(String email) {
		return userdao.findByEmail(email);
	}

	@Override
	public List<User> findByPhone(String phone_number) {
		return userdao.findByPhone(phone_number);
	}

}
