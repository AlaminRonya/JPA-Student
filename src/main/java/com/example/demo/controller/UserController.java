package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;

@RestController 
public class UserController {
	@Autowired 
	private UserService userService;
	@GetMapping("/users")
	public List<User> getAllUsers(){
		return userService.findAll();	
	}
	@GetMapping("/users/{id}")
	public Optional<User> getUserById(@PathVariable Integer id) {
		return userService.getUserById(id);
	}

}
