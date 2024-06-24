package com.java.streams.map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// get integer collection and multiply each by 3 and store in another collection or print them in console
public class MapDemo3 {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(2,4,6,8,10);
		// adding to another collection
		List<Integer> modifiedNumbers = numbers.stream().map(number-> number*3).collect(Collectors.toList());
		System.out.println(modifiedNumbers);
		
		// just printing the modified elements
		numbers.stream().map(number-> number*3).forEach(System.out::println);
		numbers.stream().map(number-> number*3).forEach(number->System.out.println(number));
		
		

	}

} 
