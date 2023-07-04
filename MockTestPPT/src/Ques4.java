import java.util.Scanner;

//Ques4 Write a Java program to find the largest of three numbers using nested if-else statements.
public class Ques4 {

	public static void main(String[] args) {
		  Scanner scanner = new Scanner(System.in);

	        System.out.println("Enter three numbers:");

	        System.out.print("Number 1: ");
	        int num1 = scanner.nextInt();

	        System.out.print("Number 2: ");
	        int num2 = scanner.nextInt();

	        System.out.print("Number 3: ");
	        int num3 = scanner.nextInt();

	        int largest;

	        if (num1 >= num2) {
	            if (num1 >= num3) {
	                largest = num1;
	            } else {
	                largest = num3;
	            }
	        } else {
	            if (num2 >= num3) {
	                largest = num2;
	            } else {
	                largest = num3;
	            }
	        }

	        System.out.println("The largest number is: " + largest);

	}

}
