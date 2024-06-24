package com.java.streams.filter;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// filter null elements from the collection and add to new collection
public class FilterDemo3 {

	public static void main(String[] args) {
		List<String> words = Arrays.asList("Apple",null , "Cat","Mike",null, "Pencil",null,"Book");
		List<String> result = words.stream().filter(word -> word!=null).collect(Collectors.toList());
		System.out.println(result);

	}

}
