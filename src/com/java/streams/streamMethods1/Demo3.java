package com.java.streams.streamMethods1;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

// return() - used to combine all the elements as one
public class Demo3 {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("A","G","F","1","4","6");
		Optional<String> reducedValue = list.stream().reduce((value, nextvalue)->{
											return value+nextvalue;
												});
		System.out.println(reducedValue.get()); //AGF146
	}

}
