import java.util.Scanner;

//Question-3 Write a Java program to calculate the average of a list of numbers using a do-while loop.
public class Ques3 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the number of elements: ");
	        int n = scanner.nextInt();

	        int sum = 0;
	        int count = 0;
	        int number;

	        System.out.println("Enter the numbers:");

	        do {
	            number = scanner.nextInt();

	           
	            sum += number;
	            count++;

	        } while (count < n);

	        
	        double average = (double) sum / n;

	        System.out.println("Average: " + average);
	}

}
