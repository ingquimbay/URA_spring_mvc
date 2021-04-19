package com.accenture.UserRegistration.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.accenture.UserRegistration.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
