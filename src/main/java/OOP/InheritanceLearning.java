package OOP;

//Inheritance - In java, we can inherit attributes/methods from classes to others
//This relationship generally consists of two parties:
//subclass (child) - the class that inherits from another
//superclass (parent) - class being inherited from
//Involves keyword -- extends --

class Vehicle {
    protected String brand = "Ford";        //Vehicle attribute
    public void honk() {                    //Vehicle method
        System.out.println("BEEP, BEEP");
    }
}

class Car extends Vehicle {
    private String modelName = "Mustang";   //Car attribute

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }
}

public class InheritanceLearning {
    public static void main(String[] args) {
        //Instantiate
        Car myCar = new Car();

        //Call honk method from vehicle on car object
        myCar.honk();

        myCar.setModelName("Mustang");

        //Display value of brand attribute & value of modelName from car
        System.out.println(myCar.brand + " " + myCar.getModelName());
    }
}

//Inheritance is useful for code reusability - reuse attributes & methods of existing class
//If you don't want a class to be inherited from - use -- final -- keyword.
