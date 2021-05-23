package com.sicemal.example.demo1.functional;

import java.util.function.Supplier;

public class SupplierDemo implements Supplier<String> {

	@Override
	public String get() {
		return "Hi Java Techie";
	}
	
	public static void main(String[] args) {
		Supplier<String> supplier = new SupplierDemo();
		System.out.println("SuplierDemo: " + supplier.get());
	}

}
