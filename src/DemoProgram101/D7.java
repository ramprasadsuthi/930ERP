package DemoProgram101;

import java.util.Scanner;

public class D7 {

	public static void main(String[] args) {
		// Compare the names 
		
		Scanner input = new Scanner(System.in);
		
		String uname; 
		System.out.print("Enter user name : ");
		uname = input.nextLine();
		if(uname.equalsIgnoreCase("Raja")) {
			System.out.println("Both the names are matching..");
		}
		else {
			System.out.println("Both the names are not matching..");
		}
		input.close();
	}

}
