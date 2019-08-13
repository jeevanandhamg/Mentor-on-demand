package com.example.jpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.jpa.model.User;
import com.example.jpa.model.UserProfile;
import com.example.jpa.repository.UserProfileRepository;
import com.example.jpa.repository.UserRepository;

@RestController
public class Controller {

	@Autowired
	UserRepository userrep;
	
	@Autowired
	UserProfileRepository userprofrep;
	
	@GetMapping("/userlist")
	public List<User> userList()
	{
		List<User> l= userrep.findAll();
		return l;
	}
	
	@GetMapping("/userprofile")
	public List<UserProfile> userProfile()
	{
		List<UserProfile> l= userprofrep.findAll();
		return l;
	}
}
