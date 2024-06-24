package com.java.streams.filter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//filtering based on single condition
public class FilterDemo1 {
	public static void main(String[] args) {
		/*ArrayList<Integer> numberList = new ArrayList<>();
		numberList.add(10);
		numberList.add(15);
		numberList.add(20);
		numberList.add(25);
		numberList.add(30);
		numberList.add(35);
		numberList.add(40);*/
		List<Integer> numberList = Arrays.asList(10,15,20,25,30,35,40);
		List<Integer> evenNumberList = new ArrayList<>();
		
		//filter the collection to even numbers without streams
		/*for(int n : numberList) {
			if(n%2 == 0)
				evenNumberList.add(n);
		}	
		System.out.println(evenNumberList);*/
		
		// using streams filter and add to new collection
		evenNumberList = numberList.stream().filter(n -> n%2==0).collect(Collectors.toList());
		System.out.println(evenNumberList);
		
		// using streams just filter and print
		numberList.stream().filter(n-> n%2==0).forEach(n->System.out.println(n));
		numberList.stream().filter(n->n%2==0).forEach(System.out::println);
		
		
		
		
	}

}
