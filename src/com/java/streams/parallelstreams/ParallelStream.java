package com.java.streams.parallelstreams;

import java.util.Arrays;
import java.util.List;

class Student{
	String name;
	int score;
	public Student(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}
	public String getName() {
		return name;
	}
	
	public int getScore() {
		return score;
	}
	
}
public class ParallelStream {

	public static void main(String[] args) {
		List<Student> students = Arrays.asList(
											new Student("Swetha" , 80),
											new Student("Venkat" , 85),
											new Student("Rithwik" , 95),
											new Student("Vihaan" , 90),
											new Student("Siri" , 64),
											new Student("Alexa" , 56),
											new Student("Marble" , 73)
											);
		//Stream to filter and limit works sequentially
		students.stream().filter(student-> student.getScore()>75).limit(3).forEach(student->System.out.println(student.getName() + " " + student.getScore()));
		
		//parallelStream() to filter and limit works sequentially
		students.parallelStream().filter(student-> student.getScore()>75).limit(3).forEach(student->System.out.println(student.getName() + " " + student.getScore()));
		
		//convert stream to parallelStream using parallel()
		students.stream().parallel().filter(student-> student.getScore()>75).limit(3).forEach(student->System.out.println(student.getName() + " " + student.getScore()));
		
	}

}
