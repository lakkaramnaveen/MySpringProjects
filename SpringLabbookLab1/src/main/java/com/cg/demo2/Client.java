package com.cg.demo2;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
public static void main(String[] args) {
	
	ApplicationContext ctx=new ClassPathXmlApplicationContext("bean2.xml");

	Employee emp=ctx.getBean("emp",Employee.class);
	System.out.println("Employee Details");
	System.out.println("-------------------------");
	System.out.println(emp.toString());
	
}
}
