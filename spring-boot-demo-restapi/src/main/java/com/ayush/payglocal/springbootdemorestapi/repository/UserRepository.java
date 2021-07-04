package com.ayush.payglocal.springbootdemorestapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ayush.payglocal.springbootdemorestapi.model.User;

public interface UserRepository extends JpaRepository<User, String>
{
	public User findByUsername(String username);
	
	public User findByUsernameAndPassword(String username, String password);
}
