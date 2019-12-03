package com.training.beans;

public class SellBike {
	private String ownm,bnm,color,date,desc,negotiable;
	private String scost;
	public SellBike() {
		super();
		
	}
	public SellBike(String ownm, String bnm, String color, String date, String desc, String negotiable, String scost2) {
		super();
		this.ownm = ownm;
		this.bnm = bnm;
		this.color = color;
		this.date = date;
		this.desc = desc;
		this.negotiable = negotiable;
		this.scost = scost2;
	}
	public String getOwnm() {
		return ownm;
	}
	public void setOwnm(String ownm) {
		this.ownm = ownm;
	}
	public String getBnm() {
		return bnm;
	}
	public void setBnm(String bnm) {
		this.bnm = bnm;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getNegotiable() {
		return negotiable;
	}
	public void setNegotiable(String negotiable) {
		this.negotiable = negotiable;
	}
	public String getScost() {
		return scost;
	}
	public void setScost(String scost) {
		this.scost = scost;
	}
	@Override
	public String toString() {
		return "SellBike [ownm=" + ownm + ", bnm=" + bnm + ", color=" + color + ", date=" + date + ", desc=" + desc
				+ ", negotiable=" + negotiable + ", scost=" + scost + "]";
	}
	
	
	

}
