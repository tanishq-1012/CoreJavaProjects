import java.util.Scanner;

public class ExceptionExm2 {

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
		
		System.out.println("Enter the size of an array");
		int size = scn.nextInt();
		int[] a = new int[size];
		
		System.out.println("Enter the element to be inserted in that array");
		int elem = scn.nextInt();
		
		System.out.println("Enter the position at which the element to be inserted");
		int pos = scn.nextInt();
		
		a[pos] = elem;
		System.out.println("Element "+elem+" Inserted at "+pos+" Successfully");
		
		}
		catch(ArithmeticException ae) {
			System.out.println("Please provide non zero denominator");
		}
		catch(NegativeArraySizeException nae) {
			System.out.println("Please be positive");
		}
		catch(ArrayIndexOutOfBoundsException a) {
			System.out.println("Be in your limits, Don't cross it");
		}
		catch(Exception e) {
			System.out.println("Wrong input");
		}
		
		System.out.println("Connection is terminated");
	}

}
