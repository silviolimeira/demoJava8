package com.sicemal.example.demo1;

interface Calculator {
	//void switchOn();
	void sum(int a, int b);
}

public class App 
{

	public static void main(String[] args) {
		
		// Implement interface using lambda expression with parameters
		Calculator calculator = (a, b) -> {
			System.out.println("Sum: " + (a + b));
		};
		calculator.sum(2,3);
		
	}
	
}
