//Ques2 - Create a superclass called Shape with an abstract method calculateArea() that returns the area of the shape. 
//Implement subclasses Rectangle, Circle, and Triangle that inherit from the Shape class. 
//Implement the calculateArea() method in each subclass to calculate and return the area of a rectangle, circle, and triangle, respectively. 
//Then, create a class called ShapeCalculator with a method printArea(Shape shape) that accepts an object of type Shape and prints its area. 
//Demonstrate polymorphism by passing instances of different subclasses to the printArea() method.

abstract class Shape {
    public abstract double calculateArea();
}

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
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return 0.5 * base * height;
    }
}

class ShapeCalculator {
    public void printArea(Shape shape) {
        double area = shape.calculateArea();
        System.out.println("The area of the shape is: " + area);
    }
}
public class Question2 {

	public static void main(String[] args) {
		 ShapeCalculator shapeCalculator = new ShapeCalculator();

	        Rectangle rectangle = new Rectangle(4, 6);
	        shapeCalculator.printArea(rectangle); 

	        Circle circle = new Circle(5);
	        shapeCalculator.printArea(circle); 

	        Triangle triangle = new Triangle(3, 7);
	        shapeCalculator.printArea(triangle); 
	}

}
