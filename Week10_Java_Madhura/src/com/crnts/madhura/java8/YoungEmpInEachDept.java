package com.crnts.madhura.java8;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class YoungEmpInEachDept {
	
	public static void main(String[] args) {
		List<Employee> employeeList=new GetEmployeeList().employeeList();
		employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment)).entrySet().
		forEach((employee)->
		{
			System.out.println("youngest employee in "+employee.getKey()+" department");
			Optional<Employee> min = employee.getValue().stream().min(Comparator.comparing(Employee::getAge));
			System.out.println(min.get());  
		});
	}

}
