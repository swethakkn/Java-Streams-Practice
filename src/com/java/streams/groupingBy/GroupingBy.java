package com.java.streams.groupingBy;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class GroupingBy {
	public static void main(String[] args) {
		ArrayList<Student> studentList = new ArrayList<>();
		studentList.add(new Student(1,"Swetha",50,"ECE"));
		studentList.add(new Student(2,"Venkat",65,"CSE"));
		studentList.add(new Student(3,"Rith",70,"ECE"));
		studentList.add(new Student(4,"vihi",75,"EEE"));
		studentList.add(new Student(5,"Siri",30,"IT"));
		studentList.add(new Student(6,"Alexa",28,"CSE"));
		Map<Object,List<Student>> studentsGroups = studentList.stream().collect(
													Collectors.groupingBy(stu -> stu.getDepartment()));	
		//studentsGroups.forEach((k,v)-> System.out.println(k+ "---->" + v));
		Map<Object,List<Student>> studentsGroups1 = studentList.stream().collect(
				Collectors.groupingBy(Student :: getDepartment));
		System.out.println(studentsGroups1);
	}


}
