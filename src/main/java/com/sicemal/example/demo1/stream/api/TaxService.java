package com.sicemal.example.demo1.stream.api;

import java.util.List;
import java.util.stream.Collectors;

public class TaxService {
	
	public static List<Employee> evaluateTaxUsers(String input) {
//		if (input.equalsIgnoreCase("tax")) {
//				
//			return Database.getEmployees()
//					.stream().filter(emp -> emp.getSalary() > 500000)
//					.collect(Collectors.toList());
//		} else {
//			return Database.getEmployees()
//					.stream().filter(emp -> emp.getSalary() < 500000)
//					.collect(Collectors.toList());
//		}
		
		return (input.equalsIgnoreCase(input))
				? Database.getEmployees().stream().filter(emp -> emp.getSalary() > 500000).collect(Collectors.toList())
				: Database.getEmployees().stream().filter(emp -> emp.getSalary() <= 500000).collect(Collectors.toList());
}
	
	public static void main(String[] args) {
		System.out.println("evaluateTaxUsers('tax'): =================");
		System.out.println(evaluateTaxUsers("tax"));
		System.out.println("evaluateTaxUsers('none'): =================");
		System.out.println(evaluateTaxUsers("non tax"));

	}

}
