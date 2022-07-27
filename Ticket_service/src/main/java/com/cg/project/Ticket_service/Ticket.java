package com.cg.project.Ticket_service;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Ticket {
	public Ticket() {
		
	}
	public Ticket(int tId, String pNRno, String quota, String tclass, String dobooking, String doJourney,
			String distance, String soucre, String destination, int noOfPassenger, int moblieNo) {
		super();
		this.tId = tId;
		PNRno = pNRno;
		this.quota = quota;
		this.tclass = tclass;
		this.dobooking = dobooking;
		this.doJourney = doJourney;
		this.distance = distance;
		this.soucre = soucre;
		this.destination = destination;
		this.noOfPassenger = noOfPassenger;
		MoblieNo = moblieNo;
	}
	
	@Id
	@GeneratedValue
	private int tId;
	private String PNRno;
	private String quota;
	private String tclass;
	private String dobooking;
	private String doJourney;
	private String distance;
	private String soucre;
	private String destination;
	private int noOfPassenger;
	private int MoblieNo;
	
	public int gettId() {
		return tId;
	}
	public void settId(int tId) {
		this.tId = tId;
	}
	public String getPNRno() {
		return PNRno;
	}
	public void setPNRno(String pNRno) {
		PNRno = pNRno;
	}
	public String getQuota() {
		return quota;
	}
	public void setQuota(String quota) {
		this.quota = quota;
	}
	public String getTclass() {
		return tclass;
	}
	public void setTclass(String tclass) {
		this.tclass = tclass;
	}
	public String getDobooking() {
		return dobooking;
	}
	public void setDobooking(String dobooking) {
		this.dobooking = dobooking;
	}
	public String getDoJourney() {
		return doJourney;
	}
	public void setDoJourney(String doJourney) {
		this.doJourney = doJourney;
	}
	public String getDistance() {
		return distance;
	}
	public void setDistance(String distance) {
		this.distance = distance;
	}
	public String getSoucre() {
		return soucre;
	}
	public void setSoucre(String soucre) {
		this.soucre = soucre;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public int getNoOfPassenger() {
		return noOfPassenger;
	}
	public void setNoOfPassenger(int noOfPassenger) {
		this.noOfPassenger = noOfPassenger;
	}
	public int getMoblieNo() {
		return MoblieNo;
	}
	public void setMoblieNo(int moblieNo) {
		MoblieNo = moblieNo;
	}
	@Override
	public String toString() {
		return "Ticket [tId=" + tId + ", PNRno=" + PNRno + ", quota=" + quota + ", tclass=" + tclass + ", dobooking="
				+ dobooking + ", doJourney=" + doJourney + ", distance=" + distance + ", soucre=" + soucre
				+ ", destination=" + destination + ", noOfPassenger=" + noOfPassenger + ", MoblieNo=" + MoblieNo + "]";
	}
	

}
