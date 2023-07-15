// Abstract class with abstract and concrete methods
abstract class AbstractClass {
    // Concrete method
    public void concreteMethod1() {
        System.out.println("This is concrete method 1.");
    }

    // Concrete method
    public void concreteMethod2() {
        System.out.println("This is concrete method 2.");
    }

    // Abstract method 1 - To be implemented by subclasses
    public abstract void abstractMethod1();

    // Abstract method 2 - To be implemented by subclasses
    public abstract void abstractMethod2();
}

// Concrete subclass 1
class Subclass1 extends AbstractClass {
    @Override
    public void abstractMethod1() {
        System.out.println("Subclass1 - Implementation of abstract method 1.");
    }

    @Override
    public void abstractMethod2() {
        System.out.println("Subclass1 - Implementation of abstract method 2.");
    }
}

// Concrete subclass 2
class Subclass2 extends AbstractClass {
    @Override
    public void abstractMethod1() {
        System.out.println("Subclass2 - Implementation of abstract method 1.");
    }

    @Override
    public void abstractMethod2() {
        System.out.println("Subclass2 - Implementation of abstract method 2.");
    }
}
public class Ques2 {

	public static void main(String[] args) {
		AbstractClass subclass1 = new Subclass1();
        AbstractClass subclass2 = new Subclass2();

        subclass1.concreteMethod1();
        subclass1.concreteMethod2();
        subclass1.abstractMethod1();
        subclass1.abstractMethod2();

        subclass2.concreteMethod1();
        subclass2.concreteMethod2();
        subclass2.abstractMethod1();
        subclass2.abstractMethod2();
	}

}
