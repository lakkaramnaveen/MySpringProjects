package com.cg.demo4;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Client {
	public static void main(String[] args) throws EmployeeException {
		ApplicationContext context = new ClassPathXmlApplicationContext("bean4.xml");
		EmployeeDao sbu = context.getBean("emp", EmployeeDao.class);
		Scanner s = new Scanner(System.in);
		
		int empId=0;
		try {
			System.out.print("Enter Employee Id		: ");
			empId = s.nextInt();
			EmployeeService empService = new EmployeeServiceImpl();
			Employee emp = empService.getDetails(empId);
			
				
				if (emp == null) {
					System.out.println("No Employee Exist");
//					main(null);
				} else {
					System.out.println("Employee Info: ");
					System.out.println("Employee Id			: " + emp.getEmployeeId());
					System.out.println("Employee Name			: " + emp.getEmployeeName());
					System.out.println("Employee Salary			: " + emp.getSalary());
//					main(null);
				}
		} catch (Exception e) {
			System.err.println("Enter Correct Input In Numbers Only");
			s.nextLine();
			
			main(null);
		}
	
	}
}
