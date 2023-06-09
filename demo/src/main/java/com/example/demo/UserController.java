package com.example.demo;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
	private UserService userservice;
	@GetMapping("/users")
	public ArrayList<User> disp(){
		return userservice.display();
	}
	
	@PostMapping("/new")
	public ArrayList<User> add(@RequestBody User u) {
		return userservice.adduser(u);
		
	}
	@DeleteMapping("/{id}")
	public ArrayList<User> Userrem(@PathVariable int id){
		return userservice.del(id);
	}
	 
	@PutMapping("/change")
		public User updUser(@RequestBody User user) {
			return userservice.update(user);
		}
	}
	

