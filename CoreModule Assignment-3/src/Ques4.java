class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }
}
public class Ques4 {

	public static void main(String[] args) {
		Calculator calculator = new Calculator();

        // Calling the add method with two integer arguments
        int sum1 = calculator.add(5, 10);
        System.out.println("Sum of 5 and 10: " + sum1);

        // Calling the add method with two double arguments
        double sum2 = calculator.add(3.14, 2.71);
        System.out.println("Sum of 3.14 and 2.71: " + sum2);

        // Calling the add method with three integer arguments
        int sum3 = calculator.add(2, 4, 6);
        System.out.println("Sum of 2, 4, and 6: " + sum3);

	}

}
