package com.nit.runner;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nit.entity.Profile;
import com.nit.entity.User;
import com.nit.task.UserController;

@Component
public class UserRunner implements CommandLineRunner {
	@Autowired
	UserController controller;

	@Override
	public void run(String... args) throws Exception {
		System.out.println("1. Add Profile");
		System.out.println("2. Get user details along with profile");
		System.out.println("3. Update User");
		System.out.println("4. Delete User");

		int choice = Integer.parseInt(IO.readln("Enter Your choice"));
		switch (choice) {
		case 1 -> {
			String phone = IO.readln("Enter Phone number");
			String address = IO.readln("Enter Address");
			Profile profile = new Profile(phone, address);
			String name = IO.readln("Enter User Name");
			String email = IO.readln("Enter Email id");
			User user = new User(name, email, profile);
			String userWithProfile = controller.createUserWithProfile(user);
			System.out.println(userWithProfile);
		}

		case 2 -> {
			Long id = Long.parseLong(IO.readln("Enter id want to find"));
			Optional<User> fetchUserDetailsWithProfile = controller.fetchUserDetailsWithProfile(id);
			User user = fetchUserDetailsWithProfile.get();
			System.out.println(user);
		}
		case 3 ->{
			Long searchId = Long.parseLong(IO.readln("Enter id want to update"));
			String phone = IO.readln("Enter new Phone number");
			String address = IO.readln("Enter new Address");
			Profile profile = new Profile(phone, address);
			String name = IO.readln("Enter new User Name");
			String email = IO.readln("Enter new Email id");
			User user = new User(name, email, profile);
			String userUpdate = controller.userUpdate(searchId, user);
			System.out.println(userUpdate);	
		}
		case 4 -> {
			Long id = Long.parseLong(IO.readln("Enter id want to delete user"));
			controller.deleteUser(id);
		}
		default -> System.err.println("Invalid choice");
		}
	}

}
