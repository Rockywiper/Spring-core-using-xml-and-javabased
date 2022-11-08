package com.javabased;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Studentconfigure 
{
	@Bean
	public Student getDetails() 
	{
		return new Student(1, "Prasanth", getAddress());	
	}
	
	public Address getAddress()
	{
		return new Address("Chennai", "Tamilnadu");
	}
	
}
