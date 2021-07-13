package com.cg.census.profile.CensusProfiling.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.census.profile.CensusProfiling.model.User;

@Repository
public interface UserRepository extends JpaRepository<User , Integer> {
	
	public abstract List<User> findByfirstName(String firstName);
	
}
