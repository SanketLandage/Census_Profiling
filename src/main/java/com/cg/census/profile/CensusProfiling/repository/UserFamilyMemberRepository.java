package com.cg.census.profile.CensusProfiling.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.census.profile.CensusProfiling.model.User;
import com.cg.census.profile.CensusProfiling.model.UserFamilyMember;

public interface UserFamilyMemberRepository extends JpaRepository<UserFamilyMember, Integer>{
	//public abstract List<User> findByfirstName(String firstName);
}
