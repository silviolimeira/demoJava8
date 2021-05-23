package com.sicemal.example.demo1.functional;

import java.util.function.Predicate;

public class PredicateDemo implements Predicate<Integer> {

	@Override
	public boolean test(Integer t) {
		if (t % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		Predicate<Integer> predicate = new PredicateDemo();
		System.out.println(predicate.test(4));
		System.out.println(predicate.test(7));
	}

}
