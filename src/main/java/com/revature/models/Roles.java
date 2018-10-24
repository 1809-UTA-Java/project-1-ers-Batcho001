package com.revature.models;

public class Roles {

	int r_id;
	String role;
	
	public Roles(int r_id, String role) {
		super();
		this.r_id = r_id;
		this.role = role;
	}

	public Roles() {
		super();
	}

	public int getR_id() {
		return r_id;
	}

	public void setR_id(int r_id) {
		this.r_id = r_id;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "Roles [r_id=" + r_id + ", role=" + role + "]";
	};
	
}
