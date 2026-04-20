package com.nit.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nit.entity.Profile;
import com.nit.entity.User;
import com.nit.repo.ProfileRepository;
import com.nit.repo.UserRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class UserService implements IUserService {
	@Autowired
	UserRepository userRepository;

	@Autowired
	ProfileRepository profileRepository;

	// Add user with profile
	@Override
	public String addUserWithProfile(User user) {
		Long id = userRepository.save(user).getUId();
		return "Id: " + id + " Added Sucessfully";
	}

	// Get user details along with profile
	@Override
	public Optional<User> getUserDetailsWithProfile(Long id) {
		Optional<User> byId = userRepository.findById(id);
		return byId;
	}

	// Update
	// user
	@Override
	public String userUpdate(Long uId, User user) {
		Optional<User> byId = userRepository.findById(uId);
		User user2 = byId.get();
		Long uId2 = user2.getUId();
		if (uId2 == uId) {
			Long uId3 = userRepository.save(user).getUId();
			return "Id: " + uId3 + " User Updated Sucessfully";
		} else {
			return uId + ": Not found please Enter valid user id";
		}
	}

//	// profile
//	@Override
//	public String profileUpdate(Long pId, Profile profile) {
//		Optional<Profile> byId = profileRepository.findById(pId);
//		Profile profile2 = byId.get();
//		Long pId2 = profile2.getPId();
//		if (pId2 == pId) {
//			Long pId3 = profileRepository.save(profile).getPId();
//			return "ID: " + pId3 + " Profile Updated Sucessfully";
//		} else {
//			return pId + " Not found please Enter valid user id";
//		}
//	}

	// Delete user
	@Override
	public void deleteUser(Long id) {
		userRepository.deleteUser(id);
	}
}
