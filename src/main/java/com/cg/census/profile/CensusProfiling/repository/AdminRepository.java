package com.cg.census.profile.CensusProfiling.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.census.profile.CensusProfiling.model.Admin;

public interface AdminRepository extends JpaRepository<Admin , Integer> {
	
}
