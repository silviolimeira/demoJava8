package com.sicemal.example.demo1;

interface Calculator {
	int subtract(int a, int b);
}

public class App 
{

	public static void main(String[] args) {
		
		// Implement interface using lambda expression with parameters and result return
		Calculator calculator = (a, b) -> {
			if (a < b) {
				throw new RuntimeException("a greater than b.");
			} else {
				return a - b;
			}
		};
		System.out.println("Result (8-3): " + calculator.subtract(3,8));
		
	}
	
}
