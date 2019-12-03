package com.training.beans;

public class Bike {
	private String bname;
	private String bcolor;
	
	public Bike() {
		super();
		
	}

	@Override
	public String toString() {
		return "Bike [bname=" + bname + ", bcolor=" + bcolor + "]";
	}

	public String getBname() {
		return bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

	public String getBcolor() {
		return bcolor;
	}

	public void setBcolor(String bcolor) {
		this.bcolor = bcolor;
	}

	public Bike(String bname, String bcolor) {
		super();
		this.bname = bname;
		this.bcolor = bcolor;
	}
	

}
