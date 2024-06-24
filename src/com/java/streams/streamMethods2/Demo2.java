package com.java.streams.streamMethods2;

import java.util.HashSet;
import java.util.Set;
// these methods are predicate means takes one argument and returns boolean
//anyMatch()
//allMatch()
//noneMatch() all three returns boolean
public class Demo2 {

	public static void main(String[] args) {
		Set<String> fruits = new HashSet<>();
		fruits.add("One Apple");
		fruits.add("One Banana");
		fruits.add("Two Apple");
		fruits.add("Five Kiwi");
		fruits.add("One Mango");
		
		//anyMatch - returns true if there is any element that starts with specified string
		boolean result = fruits.stream().anyMatch(fruit -> {return fruit.startsWith("One");});
		System.out.println(result);
		
		//allMatch - returns true if there all elements starts with specified string
		result = fruits.stream().allMatch(fruit -> {return fruit.startsWith("One");});
		System.out.println(result);
		
		//noneMatch - returns true if no element exists that starts with specified string
		result = fruits.stream().noneMatch(fruit -> {return fruit.startsWith("One");});
		System.out.println(result);
		
		
		
		
		

	}

}
