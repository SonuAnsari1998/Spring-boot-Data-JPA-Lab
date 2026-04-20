package com.nit.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.nit.entity.User;

import jakarta.transaction.Transactional;

public interface UserRepository extends JpaRepository<User, Long>{
	
	@Modifying
	@Transactional
	@Query("UPDATE User u SET u.name = :name, u.email = :email WHERE u.uId = :id")
	int updateUser(@Param("id") Long id,
	               @Param("name") String name,
	               @Param("email") String email);
	
	
	
	
	//Delete user
	@Modifying
	@Transactional
	@Query("DELETE FROM Profile p WHERE p.pId = ?1")
	void deleteUser(Long id);	
}
