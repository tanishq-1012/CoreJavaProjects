// Abstract class representing a Shape
abstract class Shape {
    public abstract double calculateArea();
    public abstract double calculatePerimeter();
}
//Concrete class representing a Rectangle
class Rectangle extends Shape {
 private double length;
 private double width;

 public Rectangle(double length, double width) {
     this.length = length;
     this.width = width;
 }

 @Override
 public double calculateArea() {
     return length * width;
 }
 @Override
 public double calculatePerimeter() {
     return 2 * (length + width);
 }
}

// Concrete class representing a Circle
class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

public class Ques9 {

	public static void main(String[] args) {
		 Shape circle = new Circle(5.0);
	        System.out.println("Circle Area: " + circle.calculateArea());
	        System.out.println("Circle Perimeter: " + circle.calculatePerimeter());

	        Shape rectangle = new Rectangle(4.0, 6.0);
	        System.out.println("Rectangle Area: " + rectangle.calculateArea());
	        System.out.println("Rectangle Perimeter: " + rectangle.calculatePerimeter());
	}

}
