package com.java.streams.groupingBy;

public class Student {
		private int id;
		private String firstName;
		private int marks;
		private String department;
		public Student(int id, String firstName, int marks, String department) {
			super();
			this.id = id;
			this.firstName = firstName;
			this.marks = marks;
			this.department = department;
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
		
		
		public String getDepartment() {
			return department;
		}
		public void setDepartment(String department) {
			this.department = department;
		}
		@Override
		public String toString() {
			return "Student [id=" + id + ", firstName=" + firstName + ", marks=" + marks + ", department=" + department
					+ "]";
		}
		


}
