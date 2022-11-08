package com.corespring;

public class Orderdetails 
{
	private long orderid;
	private Userdetails userdetails;
	private Productdetails product;
	
	public Orderdetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Orderdetails(long orderid, Userdetails userdetails, Productdetails product) {
		super();
		this.orderid = orderid;
		this.userdetails = userdetails;
		this.product = product;
	}

	public long getOrderid() {
		return orderid;
	}

	public void setOrderid(long orderid) {
		this.orderid = orderid;
	}

	public Userdetails getUserdetails() {
		return userdetails;
	}

	public void setAddress(Userdetails userdetails) {
		this.userdetails = userdetails;
	}

	public Productdetails getProduct() {
		return product;
	}

	public void setProduct(Productdetails product) {
		this.product = product;
	}

	@Override
	public String toString() {
		return "Orderdetails [OrderID = " + orderid +", \nUserdetails = " + userdetails + ", \nProduct = " + product + "]";
	}

	
}
