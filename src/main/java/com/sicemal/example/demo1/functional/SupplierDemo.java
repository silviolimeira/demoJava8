package com.sicemal.example.demo1.functional;

import java.util.function.Supplier;

public class SupplierDemo {

	public static void main(String[] args) {
		
		Supplier<String> supplier = () -> {
			return "Hi Java Techie";
		};
		
		System.out.println("Supplier Demo: " + supplier.get());
		
	}

}
