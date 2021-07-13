package com.cg.census.profile.CensusProfiling.model;

public class Admin {
	String Username;
	String password;

	public Admin(String username, String password) {
		super();
		Username = username;
		this.password = password;
	}

	public String getUsername() {
		return Username;
	}

	public void setUsername(String username) {
		Username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	// pub
}
