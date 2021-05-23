package com.sicemal.example.demo1.stream.sort;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

import com.sicemal.example.demo1.stream.api.Employee;

public class SortTreeMapEmployee {
	
	public static void main(String[] args) {

		// Sorting tree map employee using anonymous comparator function
		Map<Employee, Integer> employeeMap = new TreeMap<>(new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				return (int)(o1.getSalary() - o2.getSalary());
			}
			
		});
		
		employeeMap.put(new Employee(176, "Roshan", "IT", 600000), 60);
		employeeMap.put(new Employee(388, "Bikash", "CIVIL", 900000), 90);
		employeeMap.put(new Employee(470, "Bimal", "DEFENCE", 500000), 50);
		employeeMap.put(new Employee(624, "Sourav", "CORE", 400000), 40);
		employeeMap.put(new Employee(176, "Prakash", "SOCIAL", 1200000), 120);	

		System.out.println("Sorting tree map employee using anonymous comparator function: ");
		System.out.println(employeeMap);
		
		// Sorting tree map employee using lambda
		Map<Employee, Integer> employeeMapL = new TreeMap<>((o1, o2) -> (int)(o1.getSalary() - o2.getSalary()));
		employeeMapL.put(new Employee(176, "Roshan", "IT", 600000), 60);
		employeeMapL.put(new Employee(388, "Bikash", "CIVIL", 900000), 90);
		employeeMapL.put(new Employee(470, "Bimal", "DEFENCE", 500000), 50);
		employeeMapL.put(new Employee(624, "Sourav", "CORE", 400000), 40);
		employeeMapL.put(new Employee(176, "Prakash", "SOCIAL", 1200000), 120);	

		System.out.println("Sorting tree map employee using lambda: ");
		System.out.println(employeeMapL);
		
		System.out.println("Sorting tree map employee using stream: ");
		employeeMapL.entrySet().stream().sorted(
			Map.Entry.comparingByKey(Comparator.comparing(Employee::getSalary).reversed()))
			.forEach(System.out::print);
		
	}

}
