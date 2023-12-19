package com.ty;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
	
	public static void main(String[] args) {
		
		ConfigurableApplicationContext context=new ClassPathXmlApplicationContext("conf.xml");
		
		Teacher teacher=(Teacher)context.getBean("teacher");
		
		System.out.println(teacher.age);
	}

}
