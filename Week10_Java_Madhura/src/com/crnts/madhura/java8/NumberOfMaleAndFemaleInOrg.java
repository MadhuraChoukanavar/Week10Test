package com.crnts.madhura.java8;

import java.util.List;
import java.util.stream.Collectors;

public class NumberOfMaleAndFemaleInOrg {
	
	public static void main(String[] args) {
		List<Employee> employeeList=new GetEmployeeList().employeeList();
		
		employeeList.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.counting())).entrySet()
		.forEach((emp)->
		{
			System.out.println("Number of "+emp.getKey()+" in the organization = "+emp.getValue());
		}
		);
	}

}
