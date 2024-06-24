package com.java.streams.partitioningBy;

public class Student {
	private int id;
	private String firstName;
	private int marks;
	public Student(int id, String firstName, int marks) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.marks = marks;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", firstName=" + firstName + ", marks=" + marks + "]";
	}
	

}
