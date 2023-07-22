import java.util.Scanner;

public class ExceptionExm1 {

	public static void main(String[] args) {
		System.out.println("Connection to calc app is established");
		
		try {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the 1st number");
		int num1 = scn.nextInt();
		
		System.out.println("Enter the 2nd number");
		int num2 = scn.nextInt();
		
		int res = num1/num2;
		System.out.println("The result is "+res);
		}
		catch(Exception e) {
			System.out.println("You are tring to divide by zero");
		}
		
		System.out.println("Connection is terminated");
	}

}
