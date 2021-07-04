package com.ayush.payglocal.springbootdemorestapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ayush.payglocal.springbootdemorestapi.model.User;
import com.ayush.payglocal.springbootdemorestapi.service.UserService;

@RestController
public class AppController
{
	class ResponseText
	{
		private String responseText;
		
		public ResponseText(String text)
		{
			this.responseText = text;
		}
		
		public String getResponseText()
		{
			return responseText;
		}

		public void setResponseText(String errorText)
		{
			this.responseText = errorText;
		}
	}
	
	@Autowired
	private UserService service;
	
	// Registration Function
	@CrossOrigin(origins = "null")
	@PostMapping("/register")
	@ResponseBody
	public ResponseText registerUser(@RequestBody User user)
	{
		String username = user.getUsername();
		if(username != null && !username.equals(""))
		{
			User u = service.getUserByUsername(username);
			if(u != null)
			{
				return new ResponseText("Username already used");
			}
		}
		
		User createdUser = null;
		try
		{
			createdUser = service.saveNewUser(user);
		}
		catch (Exception e)
		{
			return new ResponseText("Registration failed");
		}
		
		return new ResponseText("User registered successfully with username " + createdUser.getUsername());
	}
	
	// Login function
	@CrossOrigin(origins = "null")
	@PostMapping("/login")
	@ResponseBody
	public ResponseText loginUser(@RequestBody User user)
	{
		String username = user.getUsername();
		String password = user.getPassword();
		
		if(username != null && !username.equals(""))
		{
			User u = service.getUserByUsername(username);
			if(u == null)
			{
				return new ResponseText("User does not exist");
			}
		}
		
		if(password != null && !password.equals(""))
		{
			User u = service.getUserByNameAndPass(username, password);
			if(u == null)
			{
				return new ResponseText("Wrong credentials entered");
			}
			else
			{
				return new ResponseText("Logged in successfully as " + u.getUsername());
			}
		}
		
		return new ResponseText("Login failed");
	}
}
