package com.nit.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.nit.entity.Profile;

import jakarta.transaction.Transactional;

public interface ProfileRepository extends JpaRepository<Profile, Long>{

	@Modifying
	@Transactional
	@Query("UPDATE Profile p SET p.address = :address, p.phone = :phone WHERE p.pId = :userId")
	int updateProfile(@Param("userId") Long userId,
	                  @Param("address") String address,
	                  @Param("phone") String phone);	
}
