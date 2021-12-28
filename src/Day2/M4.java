package Day2;

import java.util.Scanner;
import DemoProgram101.D8;
import Day2.M3;

public class M4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// write the same program by creating object and use the method
		// keep M3 in different package and try the program
		
		D8 obj = new D8();
		
		String sname, clg;
		sname = getStudentName();
		clg = obj.getCollegeName();
		
		
		System.out.println("Student name is : " + sname);
		System.out.println("College name is : " + clg);
	}

	public static String getStudentName() {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Student Name : ");
		String str = input.nextLine();
		return str;
	}

}
