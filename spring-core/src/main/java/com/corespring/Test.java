package com.corespring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test 
{
	public static void main( String[] args )
    {
        //Spring containers 1.beanFactory 2.applicationContext
    	ApplicationContext con = new ClassPathXmlApplicationContext("config.out.xml");
    	Orderdetails st=con.getBean(Orderdetails.class);
    	System.out.println(st);	
    }
}
