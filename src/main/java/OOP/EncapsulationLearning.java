package OOP;

class Person {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class EncapsulationLearning {
    //Encapsulation - to make sure "sensitive" info is hidden.
    //1. declare class variables/attributes as private
    //2. provide public get & set methods to access & update value of private variable
    public static void main(String[] args) {
        Person myObject = new Person();
        myObject.setName("john");

        System.out.println(myObject.getName());
    }
    //This allows:
    //1. Better control of class attributes & methods
    //2. Class attributes can be made read-only (if u use get method) or write-only (set)
    //3. Flexibility - can change one part of code w/o affecting others
    //4. Increased security
}
