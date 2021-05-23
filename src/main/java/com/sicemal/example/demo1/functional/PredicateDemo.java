package com.sicemal.example.demo1.functional;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo {

	public static void main(String[] args) {

		/*
		// example using lambda expression
		Predicate<Integer> predicate = 	(Integer t) -> {
			if (t % 2 == 0) {
				return true;
			} else {
				return false;
			}
		};
		*/
		System.out.println("=== Example ===");
		Predicate<Integer> predicate = t -> t % 2 == 0;
		System.out.println(predicate.test(4));
		System.out.println(predicate.test(7));
		
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		System.out.println("=== Example - List even numbers ===");
		list.stream().filter(predicate).forEach(t -> System.out.println("print Even: " + t));
		
		System.out.println("=== Example 1 - List even numbers using lambda expression with filter ===");
		list.stream().filter(t -> t % 2 == 0).forEach(t -> System.out.println("print Even: " + t));		
		
	}

}
