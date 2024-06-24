package com.java.streams.map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
// using map method of stream we are tranforming the elements into uppercase letters
public class MapDemo1 {

	public static void main(String[] args) {
		List<String> fruits = Arrays.asList("apple","Banana","KIWI","MANgo","BerrY");
		List<String> fruitsUpperCase = new ArrayList<>();
		// with out java streams
		/*for(String fruit : fruits) {
			fruitsUpperCase.add(fruit.toUpperCase());
		}
		System.out.println(fruitsUpperCase); */
		
		// with Java 8 streams
		
		fruitsUpperCase = fruits.stream().map(fruit -> fruit.toUpperCase()).collect(Collectors.toList());
		System.out.println(fruitsUpperCase);
	}

}
