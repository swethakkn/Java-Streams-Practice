package com.java.streams.flatmap;
// get the names of all students in a collection

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Student{
	int sid;
	String name;
	int grade;
	public Student(int sid,String name,int grade) {
		this.sid = sid;
		this.name = name;
		this.grade = grade;
	}
}
public class FlatMapDemo3 {

	public static void main(String[] args) {
		List<Student> studentList1 = new ArrayList<>();
		studentList1.add(new Student(100,"Vihaan" ,1));
		studentList1.add(new Student(101,"Rithwik" ,6));
		
		List<Student> studentList2 = new ArrayList<>();
		studentList2.add(new Student(102,"Varun" ,4));
		studentList2.add(new Student(103,"Advith" ,7));
		
		List<List<Student>> students = Arrays.asList(studentList1,studentList2);
		//before Java1.8
		for(List<Student> list : students) {
			for(Student student : list) {
				System.out.println(student.name);
			}
		}
		
		// with Streams of java 1.8
		
		List<String> names = students.stream()
								.flatMap(studlist -> studlist.stream())
								.map(stud -> stud.name)
								.collect(Collectors.toList());
		System.out.println(names);
		

	}

}
