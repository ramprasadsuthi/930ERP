package DemoProgram101;

import java.util.Scanner;

public class D6 {

	public static void main(String[] args) {
		// Sum of N Given Numbers, read the input from user console
		
		Scanner input = new Scanner(System.in);
		int sum = 0; int num;
		System.out.println("Enter how many numbers to read : ");
		int n = input.nextInt();
		
		for(int i=1; i<=n; i++) {
			
			System.out.println("Enter number : ");
			num = input.nextInt();
			sum = sum + num; 
		}
		
		System.out.println("The sum of N given numbers is " + sum);
		input.close();
		
   }

}
