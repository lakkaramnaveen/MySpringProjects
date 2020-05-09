package com.cg.demo3;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("bean3.xml");
	SBU sbu=context.getBean("sbu",SBU.class);
	List<Employee> emp = sbu.getEmplist();
	
	System.out.println("SBU Details");
	System.out.println("----------------------------");
	System.out.println(sbu.toString());
	
	System.out.println("Employee Details:----------------");
	
	
		System.out.println(emp.toString());

}
}
