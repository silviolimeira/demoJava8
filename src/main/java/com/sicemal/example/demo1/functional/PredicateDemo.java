package com.sicemal.example.demo1.functional;

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
		Predicate<Integer> predicate = (t) -> t % 2 == 0;

		System.out.println(predicate.test(4));
		System.out.println(predicate.test(7));
	}

}
