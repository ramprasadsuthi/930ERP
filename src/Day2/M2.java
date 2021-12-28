package Day2;

import java.util.Scanner;
import Day2.M3;

public class M2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// write the same program by creating object and use the method
		// keep M3 in different package and try the program
		String sname, course;
		sname = getStudentName();
		course = M3.getCourseName();
		
		System.out.println("Student name is : " + sname);
		System.out.println("Course name is : " + course);
	}

	public static String getStudentName() {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Student Name : ");
		String str = input.nextLine();
		return str;
	}

}
