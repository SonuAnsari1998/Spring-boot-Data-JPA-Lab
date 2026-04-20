package com.nit.service;

import java.util.List;
import java.util.Optional;

import com.nit.entity.Profile;
import com.nit.entity.User;

public interface IUserService {
	// Add user with profile
	String addUserWithProfile(User user);
	
	// Get user details along with profile
	Optional<User> getUserDetailsWithProfile(Long id);

	// Update 
	//user
	public String userUpdate(Long uId, User user);
	
	
	
	//rofile
//	public String profileUpdate(Long pid, Profile profile);
	
	
	// Delete user
	void deleteUser(Long id);
}
