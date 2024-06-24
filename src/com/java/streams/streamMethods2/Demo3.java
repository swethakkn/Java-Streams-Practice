package com.java.streams.streamMethods2;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

//findAny()
//findFirst()  - both returns Optional type
public class Demo3 {

	public static void main(String[] args) {
		List<String> fruits = Arrays.asList("Apple","Kiwi","Mango","Banana");
		//findAny() returns some element of the stream of  Optional type
		Optional<String> element = fruits.stream().findAny();
		if(element.isPresent()) //if list is empty the element.get() throws no such element exception to handle this use.ispresent method
			System.out.println(element.get());
		//findFirst() returns first element of the stream of Optional type
		element = fruits.stream().findFirst();
		System.out.println(element.get());

	}

}
