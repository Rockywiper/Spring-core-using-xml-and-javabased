package com.corespring;

public class Userdetails 
{
	private String fname;
	private String lname;
	private String mobile;
	private Address address;
	
	public Userdetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Userdetails(String fname, String lname, String mobile, Address address) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.mobile = mobile;
		this.address = address;
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
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Userdetails [First name = " + fname + ", Last name = " + lname + ", Mobile number = " + mobile + ", \nAddress = " + address
				+ "]"; 
	}
	
	
	
}
