package com.crnts.madhura.java8;

import java.util.List;
import java.util.stream.Collectors;

public class NumberOfEmpInEachDept {
	public static void main(String[] args) {
		List<Employee> employeeList=new GetEmployeeList().employeeList();
		employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment)).
		entrySet().forEach((employee)->
		{
			System.out.println("Employee in the "+employee.getKey()+" department are ");
			
			employee.getValue().forEach((value)->
			{
				System.out.println(value.getName());
			});
		});
	}

}
