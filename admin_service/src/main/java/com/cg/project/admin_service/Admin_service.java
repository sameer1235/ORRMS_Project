package com.cg.project.admin_service;

public class Admin_service {
	
	public Admin_service() {
		
	}

	private int a_id;
	private String name;
	private String a_username;
	private String a_Password;
	public int getA_id() {
		return a_id;
	}
	public void setA_id(int a_id) {
		this.a_id = a_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getA_username() {
		return a_username;
	}
	public void setA_username(String a_username) {
		this.a_username = a_username;
	}
	public String getA_Password() {
		return a_Password;
	}
	public void setA_Password(String a_Password) {
		this.a_Password = a_Password;
	}
	public Admin_service(int a_id, String name, String a_username, String a_Password) {
		super();
		this.a_id = a_id;
		this.name = name;
		this.a_username = a_username;
		this.a_Password = a_Password;
	}
	
	
}
