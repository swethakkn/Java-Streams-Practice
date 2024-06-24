package com.java.streams.streamMethods2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//Concatenating the streams
public class Demo4 {

	public static void main(String[] args) {
		List<String> fruits = Arrays.asList("Apple","Banana","Mango","Kiwi");
		List<String> flowers = Arrays.asList("Rose","Mogra","Marigold","Lily");
		Stream<String> stream1 = fruits.stream();
		Stream<String> stream2 = flowers.stream();
		List<String> finalList = Stream.concat(stream1, stream2).collect(Collectors.toList());
		System.out.println(finalList);
		for(String element : finalList)
			System.out.println(element);
		

	}

}
