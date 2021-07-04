package com.ayush.payglocal.springbootdemorestapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.support.Repositories;
import org.springframework.stereotype.Service;

import com.ayush.payglocal.springbootdemorestapi.model.User;
import com.ayush.payglocal.springbootdemorestapi.repository.UserRepository;

@Service
public class UserService
{
	@Autowired
	private UserRepository userRepo;
	
	public User saveNewUser(User user)
	{
		return userRepo.save(user);
	}
	
	public User getUserByUsername(String username)
	{
		User user = userRepo.findByUsername(username);
		return user;
	}
	
	public User getUserByNameAndPass(String username, String password)
	{
		User user = userRepo.findByUsernameAndPassword(username, password);
		return user;
	}
}
