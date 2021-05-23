package com.sicemal.example.demo1.functional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierDemo {

	public static void main(String[] args) {
		
//		Supplier<String> supplier = () -> {
//			return "Hi Java Techie";
//		};
		Supplier<String> supplier = () -> "Hi Java Techie";
		System.out.println("Supplier Demo: " + supplier.get());
		
		System.out.println("Example 2 ===========");
		List<String> list = new ArrayList<>();
		System.out.println(list.stream().findAny().orElseGet(supplier));
		System.out.println("Example 3 orElseGet with lambda ===========");
		// orElseGet with Lambda
		System.out.println(list.stream().findAny().orElseGet(() -> "No content"));
		
		System.out.println("Example 4 orElseGet with lambda ===========");
		list.add("One");
		list.add("Two");
		list.add("Three");
		System.out.println(list.stream().findAny().orElseGet(() -> "No content"));
		
	}

}
