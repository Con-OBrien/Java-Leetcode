package OOP;

//Abstraction involves hiding details & showing what you need to the user
//Can be achieved w/ abstract classes and/or interfaces
//-- abstract -- keyword is a non-access modifier for both classes and methods
//1. Abstract class is restricted so that it can't be used to make objects
//2. Abstract method can only be used in abstract class & doesn't have a body (provided by subclass)

abstract class LargeAnimal {
    public abstract void animalSound();
    public void sleep() {
        System.out.println("Sleeping...");
    }
}

class Cow extends LargeAnimal {
    public void animalSound() {
        System.out.println("The cow says: moo");
    }
}

public class AbstractionLearning {
    public static void main(String[] args) {
        Cow cow = new Cow();
        cow.animalSound();
        cow.sleep();
    }
}
