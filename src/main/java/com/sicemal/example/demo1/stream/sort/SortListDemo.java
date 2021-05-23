package com.sicemal.example.demo1.stream.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.sicemal.example.demo1.stream.api.Database;
import com.sicemal.example.demo1.stream.api.Employee;

public class SortListDemo {
	
	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();
		
		list.add(8);
		list.add(3);
		list.add(12);
		list.add(4);
		
		Collections.sort(list);
		System.out.println("SortListDemo: " + list);
		
		Collections.reverse(list);
		System.out.println("Reverse SortListDemo: " + list);
		
		System.out.println("list.stream().sorted(Comparator.reverseOrder() ==========");
		list.stream().sorted().forEach(s -> System.out.println(s)); // ASC ORDER
		System.out.println("list.stream().sorted(Comparator.reverseOrder() REVERSE order==========");
		list.stream().sorted(Comparator.reverseOrder()).forEach(s -> System.out.println(s));
		
		System.out.println("list.stream().sort Employees by salay ==========");
		List<Employee> employees = Database.getEmployees();
		Collections.sort(employees, new MyComparator());
		
		System.out.println("Employees sorted by salary: ");
		System.out.println(employees);
		
		System.out.println("Employees sorted by salary using anonymous class: ");
		employees = Database.getEmployees();
		Collections.sort(employees, new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				return (int)(o1.getSalary() - o2.getSalary());
			}
			
		});
		System.out.println(employees);
		
		System.out.println("Employees sorted by salary using lambda expression: ");
		employees = Database.getEmployees();
		Collections.sort(employees, (o1, o2) -> (int)(o1.getSalary() - o2.getSalary()));
		System.out.println(employees);
		
		System.out.println("Employees sorted by salary using stream: ");
		employees = Database.getEmployees();
		employees.stream().sorted((o1, o2) -> (int)(o1.getSalary() - o2.getSalary())).forEach(System.out::println);
		
		System.out.println("Employees sorted by salary using stream sorted with Comparator: ");
		employees = Database.getEmployees();
		employees.stream().sorted(Comparator.comparing(emp -> emp.getSalary())).forEach(System.out::println);
		
		System.out.println("Employees sorted by salary using stream sorted with Comparator.comparing::getName: ");
		employees = Database.getEmployees();
		employees.stream().sorted(Comparator.comparing(Employee::getName)).forEach(System.out::println);

	}

}

class MyComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		return (int)(o1.getSalary() - o2.getSalary());
	}
	
	
	
}
