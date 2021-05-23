package com.sicemal.example.demo1.functional;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {

	public static void main(String[] args) {
		
		/* Example 1
			Consumer<Integer> consumer = (t) -> {
				System.out.println("Printing: " + t);			
			};
			consumer.accept(10);
		*/
		/* Example 2
			Consumer<Integer> consumer = (t) -> {
				System.out.println("Printing: " + t);			
			};
			System.out.println("-----------------");
			
			List<Integer> list = Arrays.asList(1,2,3,4,5);
			list.stream().forEach(consumer);
		*/
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		list.stream().forEach(t -> System.out.println("print: " + t));
		
	}

}
