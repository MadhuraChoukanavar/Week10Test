package com.crnts.madhura.java8;

import java.util.List;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeePresentOrNOt {
	public static void main(String[] args) {
		List<Employee> employees =new GetEmployeeList().employeeList();
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the name of employee");
		String next = scn.next();
		
		long count = employees.stream().filter((emp)->emp.getName().equalsIgnoreCase(next)).count();
		System.out.println(count);
		if(count>0)
		{
			System.out.println("emp is present");
		}
		else
		{
			System.out.println("emp is not present");
		}
			
		
	}

}
