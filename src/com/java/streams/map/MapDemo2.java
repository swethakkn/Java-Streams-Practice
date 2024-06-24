package com.java.streams.map;

import java.util.Arrays;
import java.util.List;

// get the length of each element and print their length in console
public class MapDemo2 {

	public static void main(String[] args) {
		List<String> fruits = Arrays.asList("apple","Banana","KIWI","MANgo","BerrY");
		fruits.stream().map(fruit->fruit.length()).forEach(length-> System.out.println(length));
		fruits.stream().map(fruit->fruit.length()).forEach(System.out::println);		
	}
}
