package com.java.streams.filter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// filtering based on multiple conditions
public class FilterDemo2 {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Swetha", "Vihi", "Rithwik","Venkateswarlu","chikku","siri");
		List<String> filteredNames = new ArrayList<>();
		// filter elements based on length >6 and <8 
		
		filteredNames = names.stream().filter(str -> str.length()>6 && str.length()<8).collect(Collectors.toList());
		System.out.println(filteredNames);
		
		//filter and print the elements based on multiple conditions
		names.stream().filter(str -> str.length()>6 && str.length()<8).forEach(str -> System.out.println(str));
		
		names.stream().filter(str-> str.length()>6 && str.length()<8).forEach(System.out :: println);
		

	}

}
