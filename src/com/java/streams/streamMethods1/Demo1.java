package com.java.streams.streamMethods1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// Non terminal/processing methods  : distinct() , limit()
// Terminal methods : foreach(), collect(), count()
public class Demo1 {

	public static void main(String[] args) {
		List<String> vehicles = Arrays.asList("Car","Bus","Car","Bus","Aeroplane","Bicycle","Bus","Van","Aeroplane");
		
		// distinct() -  removes all the duplicate objects
		List<String> distinctVehicles = vehicles.stream().distinct().collect(Collectors.toList());
		System.out.println(distinctVehicles); //[Car, Bus, Aeroplane, Bicycle, Van]
		vehicles.stream().distinct().forEach(vehicle->System.out.println(vehicle));
		
		//limit() - limits the no of elements of the stream
		
		List<String> limitVehicles = vehicles.stream().limit(3).collect(Collectors.toList());
		System.out.println(limitVehicles); //[Car, Bus, Aeroplane]
		vehicles.stream().limit(3).forEach(vehicle->System.out.println(vehicle));
		List<String> limitDistinctVehicles = vehicles.stream().distinct().limit(3).collect(Collectors.toList());
		System.out.println(limitDistinctVehicles);
		//count() - returns long type of no of objects in the stream
		
		//long count = vehicles.stream().count(); //7
		long count = vehicles.stream().distinct().count(); // 5
		System.out.println(count);
		
	}

}
