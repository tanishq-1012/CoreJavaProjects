class Parent {
    public void display() {
        System.out.println("This is the display method in the parent class.");
    }
}

class Child extends Parent {
    @Override
    public void display() {
        System.out.println("This is the display method in the child class.");
    }
}
public class Ques2 {

	public static void main(String[] args) {
		 Parent parent = new Parent();
	        Child child = new Child();

	        // Calling the display method of the Parent class
	        parent.display();

	        // Calling the display method of the Child class
	        child.display();

	}

}
