package com.revature.models;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "EMP_USER")
public class Employees {

	@Id
	//@GeneratedValue
	private int id;
	
	@Column(name = "USER_NAME")
	private String username;
	
	//@Column(name = "USER_FIRSTNAME")
	private String fname;
	
	//@Column(name = "USER_LASTNAME")
	private String lname;
	
	//@Column(name = "USER_EMAIL")
	private String email;
	
	//@Column(name = "USER_PASSWORD")
	private String password;
	
	//@Column(name = "R_ID")
	//private int rid;
	
//	@ManyToOne(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
//	@JoinColumn(name = "EMP_ROLES")
//	Roles roles;

	public Employees(int id, String username, String fname, String lname, String email, String password) {
		super();
		this.id = id;
		this.username = username;
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.password = password;
		//this.rid = rid;
	}

	public Employees() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

//	public int getRid() {
//		return rid;
//	}
//
//	public void setRid(int rid) {
//		this.rid = rid;
//	}

	@Override
	public String toString() {
		return "employees [id=" + id + ", username=" + username + ", fname=" + fname + ", lname=" + lname + ", email="
				+ email + ", password=" + password + "]";
	}
}
