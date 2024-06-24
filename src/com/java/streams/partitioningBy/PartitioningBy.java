package com.java.streams.partitioningBy;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartitioningBy {
	public static void main(String[] args) {
		ArrayList<Student> studentList = new ArrayList<>();
		studentList.add(new Student(1,"Swetha",50));
		studentList.add(new Student(2,"Venkat",65));
		studentList.add(new Student(3,"Rith",70));
		studentList.add(new Student(4,"vihi",75));
		studentList.add(new Student(5,"Siri",30));
		studentList.add(new Student(6,"Alexa",28));
		Map<Boolean,List<Student>> firstClassStudents = studentList.stream().collect(Collectors.partitioningBy(stu -> stu.getMarks()>30));
		firstClassStudents.forEach((k,v)-> System.out.println(k +"----" + v));		
	}

}
