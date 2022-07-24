package com.cg.project.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Passenger {
	
	@Id
	@GeneratedValue
	private int Prid;
	private String PrName;
	private String PrGender;
	private int age;
	private String Address;
	private int Mno;
	
	public Passenger() {
		
	}
	public Passenger(int prid, String prName, String prGender, int age, String address, int mno) {
		super();
		Prid = prid;
		PrName = prName;
		PrGender = prGender;
		this.age = age;
		Address = address;
		Mno = mno;
	}
	
	public int getPrid() {
		return Prid;
	}
	public void setPrid(int prid) {
		Prid = prid;
	}
	public String getPrName() {
		return PrName;
	}
	public void setPrName(String prName) {
		PrName = prName;
	}
	public String getPrGender() {
		return PrGender;
	}
	public void setPrGender(String prGender) {
		PrGender = prGender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	
	public int getMno() {
		return Mno;
	}
	public void setMno(int mno) {
		Mno = mno;
	}
	@Override
	public String toString() {
		return "Passenger [Prid=" + Prid + ", PrName=" + PrName + ", PrGender=" + PrGender + ", age=" + age
				+ ", Address=" + Address + ", Mno=" + Mno + "]";
	}
	

}
