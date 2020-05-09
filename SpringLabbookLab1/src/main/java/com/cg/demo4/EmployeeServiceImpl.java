package com.cg.demo4;

public class EmployeeServiceImpl implements EmployeeService {

	public Employee getDetails(int empId) {
		EmployeeDao emp = new EmployeeDao(); //employee dao object creation
		return emp.getDetails(empId); //calling get details method
	}

}
