import java.util.Scanner;

//Question-1 Write a Java program to check whether a given number is positive, negative, or zero using an if-else statement.
public class Ques1 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int num = s.nextInt();
		
		if(num > 0) {
			System.out.println("The number is positive.");
		}
		else if(num<0) {
			System.out.println("The number is negative.");
		}
		else {
			System.out.println("The number is zero");
		}
		

	}

}
