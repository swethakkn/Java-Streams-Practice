package com.java.streams.filter;

import java.util.ArrayList;
import java.util.List;

// filter the laptop brands that are > 30000 price
class Laptop{
	int id;
	String brand;
	int price;
	public Laptop(int id, String brand, int price) {
		super();
		this.id = id;
		this.brand = brand;
		this.price = price;
	}
}

public class FilterDemo4 {

	public static void main(String[] args) {
		List<Laptop> laptops = new ArrayList<>();
		laptops.add(new Laptop(1,"HP",35000));
		laptops.add(new Laptop(2,"Lenova",45000));
		laptops.add(new Laptop(3,"Dell",50000));
		laptops.add(new Laptop(4,"Chromebook",20000));
		laptops.add(new Laptop(5,"Mac",80000));
		
		laptops.stream().filter(laptop -> laptop.price>30000).forEach(laptop -> System.out.println(laptop.brand));
		
	}

}
