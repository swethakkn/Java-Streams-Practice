package com.java.streams.streamMethods1;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

//count() , min() , max()
public class Demo2 {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		//count() to get no of even numbers
		long evencount = numbers.stream().filter(num -> num%2==0).count();
		System.out.println(evencount); //5
		
		//min() - terminal method which takes comparator and retuns Optional type
		Optional <Integer> minobject = numbers.stream().min((num1,num2)->num1.compareTo(num2));
		// to get exact value of optional type use .get() method
		System.out.println(minobject.get());  // 1 - min of collection
		
		//max()
		Optional <Integer> maxobject = numbers.stream().max((num1,num2)->num1.compareTo(num2));
		System.out.println(maxobject.get()); // 10 - max of collection

	}

}
