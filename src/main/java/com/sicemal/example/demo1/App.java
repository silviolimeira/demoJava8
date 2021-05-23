package com.sicemal.example.demo1;

interface Calculator {
	void switchOn();
}

public class App 
{

	public static void main(String[] args) {
		
		// Implement interface using lambda expression
		Calculator calculator = () -> {
			System.out.println("Switch On 1");
		};
		calculator.switchOn();
		
	}
	
}
