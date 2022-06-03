package com.masai;

public class Students {

	int roll;
	String name;
	int marks;
	
	void displayStudentDetails(int r, String n, int m) {
		
		Students details = new Students();
		
		details.roll = r;
		details.name = n;
		details.marks = m;
		
		System.out.println("Roll is: " + details.roll);
		System.out.println("Name is: " + details.name);
		System.out.println("Marks is: " + details.marks);
		
	}
	
	public static void main(String[] args) {
		
		Students details = new Students();
		
		int roll = 1;
		String name = "Gaurav Kumar";
		int marks = 10;
		
		details.displayStudentDetails(roll, name, marks);
		
	}
	
}
