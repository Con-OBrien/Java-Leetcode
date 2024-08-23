package OOP;

class Animal {
    public void animalSound() {
        System.out.println("The animal makes a sounds");
    }
}

class Pig extends Animal {
    public void animalSound() {
        System.out.println("Pig says: oink");
    }
}

class Dog extends Animal {
    public void animalSound() {
        System.out.println("Dog says: woof");
    }
}

public class PolymorphismLearning {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal pig = new Pig();
        Animal dog = new Dog();
        animal.animalSound();
        pig.animalSound();
        dog.animalSound();
    }
}

//Polymorphism is useful for code reusability
//Also uses -- extends -- keyword

