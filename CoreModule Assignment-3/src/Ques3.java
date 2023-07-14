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
public class Ques3 {

	public static void main(String[] args) {
		Animal animal1 = new Dog();
        Animal animal2 = new Cat();

        // Calling the makeSound method on the Dog object
        animal1.makeSound();

        // Calling the makeSound method on the Cat object
        animal2.makeSound();

	}

}
