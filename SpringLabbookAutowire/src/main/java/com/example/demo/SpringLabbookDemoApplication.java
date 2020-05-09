package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringLabbookDemoApplication {

	public static void main(String[] args) {
	 ConfigurableApplicationContext	ctx = SpringApplication.run(SpringLabbookDemoApplication.class, args);
	 
	 Employee emp = ctx.getBean(Employee.class);
	 SBU sbu = ctx.getBean(SBU.class);
	 
	 emp.setAge(30);
	 emp.setEmployeeId(12345);
	 emp.setEmployeeName("Harriet");
	 emp.setSalary(40000);
	 
	 sbu.setSbuId(500);
	 sbu.setSbuHead("Kiran Rao");
	 sbu.setSbuName("PES");
	 
	 
	 System.out.println("Employee Details");
	 System.out.println("-------------------------");
	 System.out.println(emp.toString());
	}

}
