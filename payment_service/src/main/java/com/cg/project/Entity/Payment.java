package com.cg.project.Entity;

public class Payment {
	public Payment() {
		
	}
	public Payment(int pId, String pType, int trxId) {
		super();
		this.pId = pId;
		PType = pType;
		TrxId = trxId;
	}
	private int pId;
	private String PType;
	private int TrxId;
	
	public int getpId() {
		return pId;
	}
	public void setpId(int pId) {
		this.pId = pId;
	}
	public String getPType() {
		return PType;
	}
	public void setPType(String pType) {
		PType = pType;
	}
	public int getTrxId() {
		return TrxId;
	}
	public void setTrxId(int trxId) {
		TrxId = trxId;
	}
	@Override
	public String toString() {
		return "Payment [pId=" + pId + ", PType=" + PType + ", TrxId=" + TrxId + "]";
	}
	

}
