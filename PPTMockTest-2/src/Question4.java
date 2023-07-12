//Ques4-Create an interface called Drawable with a method draw() that has no implementation. 
//Implement this interface in classes Circle and Rectangle. Write a program that creates objects of Circle and Rectangle and calls the draw() method on each object.


interface Drawable {
    void draw();
}

class Circle1 implements Drawable {
    @Override
    public void draw() {
        System.out.println("Drawing a circle.");
    }
}

class Rectangle1 implements Drawable {
    @Override
    public void draw() {
        System.out.println("Drawing a rectangle.");
    }
}

public class Question4 {

	public static void main(String[] args) {
		 Drawable circle = new Circle1();
	        circle.draw(); 

	        Drawable rectangle = new Rectangle1();
	        rectangle.draw(); 

	}

}
