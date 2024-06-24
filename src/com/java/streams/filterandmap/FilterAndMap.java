package com.java.streams.filterandmap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// filter the objects of employees by salary<20000 and map the salaries to increment by 50000 and add it to a collection 

class Employee{
	int id;
	String name;
	int salary;
	public Employee(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
}
public class FilterAndMap {

	public static void main(String[] args) {
		List<Employee> employees = Arrays.asList(
				new Employee(100,"Venkat",80000),
				new Employee(101,"Swetha",50000),
				new Employee(102,"Rithwik",25000),
				new Employee(103,"Vihaan",13000),
				new Employee(104,"John",30000),
				new Employee(105,"Mitra",50000)
				);
		List<Integer> salaries = employees.stream().filter(emp -> emp.salary<20000).map(emp -> emp.salary+5000).collect(Collectors.toList());
		System.out.println(salaries);
		employees.stream().filter(emp -> emp.salary<20000).map(emp -> emp.salary+5000).forEach(System.out :: println);
	}

}
