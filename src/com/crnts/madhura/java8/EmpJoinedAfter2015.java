package com.crnts.madhura.java8;

import java.util.List;

public class EmpJoinedAfter2015 {
	public static void main(String[] args) {
		List<Employee> employeeList=new GetEmployeeList().employeeList();
		employeeList.stream().filter((e)->e.getYearOfJoining()>2015).forEach((employee)->System.out.println(employee.getName()));
	}

}
