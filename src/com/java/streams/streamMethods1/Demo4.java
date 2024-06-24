package com.java.streams.streamMethods1;

import java.util.Arrays;
import java.util.List;

public class Demo4 {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("A","G","F","1","4","6");
		Object arr[] = list.stream().toArray();
		System.out.println(arr.length);
		for(Object obj : arr) {
			System.out.println(obj);
		}

	}

}
