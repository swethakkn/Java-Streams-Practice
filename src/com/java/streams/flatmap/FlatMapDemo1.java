package com.java.streams.flatmap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapDemo1 {

	public static void main(String[] args) {
		//map()
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6);
		List<Integer> processedNumbers = numbers.stream().map(n->n+10).collect(Collectors.toList());
		System.out.println(processedNumbers); //[11, 12, 13, 14, 15, 16]
		
		//flatMap()
		List<Integer> list1 = Arrays.asList(1,2);
		List<Integer> list2 = Arrays.asList(3,4);
		List<Integer> list3 = Arrays.asList(5,6);
		List<Integer> list4 = Arrays.asList(7,8);
		List<Integer> list5 = Arrays.asList(9,10);
		
		List<List<Integer>> finalList = Arrays.asList(list1,list2,list3,list4,list5); //[[1, 2], [3, 4], [5, 6], [7, 8], [9, 10]]
		List<Integer> finalFlatMapCollection = finalList.stream().flatMap(list -> list.stream()).collect(Collectors.toList());
		System.out.println(finalFlatMapCollection); //[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
		//flatMap with map
		List<Integer> finalMapCollection = finalList.stream().flatMap(list -> list.stream()).map(n->n+10).collect(Collectors.toList());
		System.out.println(finalMapCollection); //[11, 12, 13, 14, 15, 16, 17, 18, 19, 20]
		

	}

}
 