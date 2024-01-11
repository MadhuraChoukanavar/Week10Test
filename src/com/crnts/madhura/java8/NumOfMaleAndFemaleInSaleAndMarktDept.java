package com.crnts.madhura.java8;

import java.util.List;
import java.util.stream.Collectors;

public class NumOfMaleAndFemaleInSaleAndMarktDept {
	
	public static void main(String[] args) {
		List<Employee> employeeList=new GetEmployeeList().employeeList();
		employeeList.stream().filter((emp)->emp.getDepartment().equalsIgnoreCase("sales")||emp.getDepartment().equalsIgnoreCase("marketing"))
		.collect(Collectors.groupingBy(Employee::getGender,Collectors.counting())).entrySet().
		forEach((employee)->
		{
			System.out.println(employee.getKey()+"="+employee.getValue());
		});
	}

}
