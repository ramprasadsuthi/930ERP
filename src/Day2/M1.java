package Day2;

public class M1 {

	public static void main(String[] args) {
		// adding two numbers by calling add method
		int a,b;
		a=20; b=40;
		add(a,b);
		sub(a,b);
	}
	public static void sub(int a, int b) {
		// TODO Auto-generated method stub
		
		int result;
		result = a-b;
		System.out.println("The result of a-b is : " + result);
		
	}
	public static void add(int x, int y) {
		// TODO Auto-generated method stub
		int sum;
		sum = x+y;
		System.out.println("The sum of a+b is : " + sum);
	}
	// Add Multiplication method , subtraction and division methods (10 mins)
}
