//Ques1 - Create a superclass called Animal with a method makeSound() that prints the sound made by the animal. 
//Implement subclasses Dog, Cat, and Cow that inherit from the Animal class. Implement the makeSound() method in each subclass to print the sound made by a dog, cat, and cow, respectively.

class Animal {
    public void makeSound() {
        System.out.println("The animal makes a sound.");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("The dog barks.");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("The cat meows.");
    }
}

class Cow extends Animal {
    @Override
    public void makeSound() {
        System.out.println("The cow mooes.");
    }
}
public class Question1 {

	public static void main(String[] args) {
		 Animal animal1 = new Dog();
	        Animal animal2 = new Cat();
	        Animal animal3 = new Cow();

	        animal1.makeSound(); 
	        animal2.makeSound(); 
	        animal3.makeSound(); 

	}

}
