package com.javabased;

public class Student 
{
	private int id;
    private String name;
    private Address address;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int id, String name, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student [ID = "+id+", Name of the student = "+name+", He lives in = "+address+"]";
	}
	
//	public void open()
//	{
//		System.out.println("Welcome");
//	}
//	
//	public void close()
//	{
//		System.out.println("bye bye");
//	}
	
}
