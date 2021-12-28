package Day2;

import java.util.Scanner;

public class M5 {
	
	String courseID;
	String courseName;
	int cost;
	
	public void getcourseDetails() {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter course ID : ");
		courseID = input.nextLine();
		System.out.print("Enter course Name : ");
		courseName = input.nextLine();
		System.out.print("Enter course cost : ");
		cost = input.nextInt();
	}
	
	public void displaycourseDetails() {
		
		System.out.println("Course ID is : " + courseID);
		System.out.println("Course Name is : " + courseName);
		System.out.println("Course cost is : " + cost);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		M5 obj = new M5();
		
		obj.getcourseDetails();
		obj.displaycourseDetails();
		

	}

}
