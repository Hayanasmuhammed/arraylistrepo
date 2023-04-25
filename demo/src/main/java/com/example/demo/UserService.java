package com.example.demo;

import java.util.ArrayList;


import org.springframework.stereotype.Service;

@Service
public class UserService {
	ArrayList<User> users=new ArrayList<>();
	
	
	public ArrayList<User> adduser(User u) {
		 users.add(u);
		 return users;
	}
	 
	public ArrayList<User> display() {
		return users;
	}
	
	public ArrayList<User> del(int id){
		for(User u:users) {
			if(u.getId()==id) {
				 users.remove(u);
				 
			}
			
		}
		return users;
	
	}
	 public User update(User user) {
		 for(User u:users) {
			 if(user.getId()==u.getId()) {
				 users.add(user);
				 users.remove(u);
				 
			 }
		 }
		return user;
	 }


}
