package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	
	private int empAge;
	private int employeeId;
	private String employeeName;
	private double salary;
	
	@Autowired
	private SBU businessUnit; //this property will autowired to sbu class byType
	
	
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public SBU getBusinessUnit() {
		return businessUnit;
	}
	public void setBusinessUnit(SBU businessUnit) {
		this.businessUnit = businessUnit;
	}
	public int getAge() {
		return empAge;
	}
	public void setAge(int empAge) {
		this.empAge = empAge;
	}
	@Override
	public String toString() {
		return "Employee [empAge=" + empAge + ", employeeId=" + employeeId + ", employeeName=" + employeeName + ", salary="
				+ salary + "\nsbu details=" + businessUnit + "]";
	}
	
	
	
	
}
