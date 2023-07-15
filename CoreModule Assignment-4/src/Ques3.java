// Functional interface with a single abstract method
@FunctionalInterface
interface MyFunctionalInterface {
    void doSomething();
}

public class Ques3 {

	public static void main(String[] args) {
		// Using lambda expression to implement the abstract method of the functional interface
        MyFunctionalInterface funcInterface = () -> System.out.println("Doing something in functional interface.");

        // Calling the method using the functional interface
        funcInterface.doSomething();
	}

}
