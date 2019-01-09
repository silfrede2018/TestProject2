package com.thenoax.app.ws.ui.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("users")

public class UserController {
	
	
@GetMapping("/{userid}")
	
	public String getUser(@PathVariable String userid) {
		return "get user was called" + userid;
		
	}

@PostMapping

public String createUser() {
	return "create user was called";
	
}

@PutMapping

public String updateUser() {
	return "update user was called";
	
}

@DeleteMapping

public String deleteUser() {
	return "delete user was called";
	
}


}
