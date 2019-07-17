//
// A simple test class that creates a Dog and makes it speak.
//
// ****************************************************************
public class DogTest {
    public static void main(String[] args) {
    //Dog dog = new Dog("Spike");
    //System.out.println(dog.getName() + " says " + dog.speak() + ".");

    Labrador labrador = new Labrador("James", "Yellow");
    System.out.println(labrador.getName() + " says " + labrador.speak() + ".");
    System.out.println(labrador.getName() + " weights " + labrador.avgBreedWeight() + " pounds.");

    Yorkshire yorkshire = new Yorkshire("David");
    System.out.println(yorkshire.getName() + " says " + yorkshire.speak() + ".");
    }
    }