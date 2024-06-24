package com.java.streams.streamMethods2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

//sorted()
public class Demo1 {

	public static void main(String[] args) {
		//Integer sorting
		List<Integer> list1 = Arrays.asList(3,5,7,2,1,8,10,4,9,6);
		List<Integer> sortedlist1 = list1.stream().sorted().collect(Collectors.toList());//ascending order
		System.out.println(sortedlist1); 
		
		List<Integer> reverseSortedList1 = list1.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(reverseSortedList1); //Descending order
		
		//String sorting
		List<String> list2 = Arrays.asList("Swetha","Venkat","Rithwik","Vihaan");
		List<String> sortedList2 = list2.stream().sorted().collect(Collectors.toList()); //ascending order
		System.out.println(sortedList2);
		
		List<String> reverseSortedList2 = list2.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(reverseSortedList2); //descending order

	}

}
