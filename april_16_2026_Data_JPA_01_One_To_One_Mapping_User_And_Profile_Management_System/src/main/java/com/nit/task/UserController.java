package com.nit.task;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.nit.entity.User;
import com.nit.service.UserService;

@Controller
public class UserController {
	@Autowired
	UserService service;
	
	public String createUserWithProfile(User user) {
		return service.addUserWithProfile(user);
	}
	
	
	public Optional<User> fetchUserDetailsWithProfile(Long id) {
		return service.getUserDetailsWithProfile(id);
	}
	
	public String userUpdate(Long uId, User user) {
		return service.userUpdate(uId, user);
	}
	
	public void deleteUser(Long id) {
		service.deleteUser(id);
		System.out.println("ID: "+id+" Deleted Sucessfully");
	}
	
}
