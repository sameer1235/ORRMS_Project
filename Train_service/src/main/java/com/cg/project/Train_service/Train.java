package com.cg.project.Train_service;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Train {
	public Train() {
		
	}
	public Train(int tnId, int tnNo, String tnName, String startPoint, String endPoint, String arrival,
			String departure) {
		super();
		TnId = tnId;
		TnNo = tnNo;
		TnName = tnName;
		this.startPoint = startPoint;
		this.endPoint = endPoint;
		this.arrival = arrival;
		this.departure = departure;
	}
	@Id
	@GeneratedValue
	private int TnId;
	private int TnNo;
	private String TnName;
	private String startPoint;
	private String endPoint;
	private String arrival;
	private String departure;
	
	public int getTnId() {
		return TnId;
	}
	public void setTnId(int tnId) {
		TnId = tnId;
	}
	public int getTnNo() {
		return TnNo;
	}
	public void setTnNo(int tnNo) {
		TnNo = tnNo;
	}
	public String getTnName() {
		return TnName;
	}
	public void setTnName(String tnName) {
		TnName = tnName;
	}
	public String getStartPoint() {
		return startPoint;
	}
	public void setStartPoint(String startPoint) {
		this.startPoint = startPoint;
	}
	public String getEndPoint() {
		return endPoint;
	}
	public void setEndPoint(String endPoint) {
		this.endPoint = endPoint;
	}
	public String getArrival() {
		return arrival;
	}
	public void setArrival(String arrival) {
		this.arrival = arrival;
	}
	public String getDeparture() {
		return departure;
	}
	public void setDeparture(String departure) {
		this.departure = departure;
	}
	@Override
	public String toString() {
		return "Train [TnId=" + TnId + ", TnNo=" + TnNo + ", TnName=" + TnName + ", startPoint=" + startPoint
				+ ", endPoint=" + endPoint + ", arrival=" + arrival + ", departure=" + departure + "]";
	}

}
