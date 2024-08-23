package DS;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListLearning{
    public static void main(String[] args) {

        //Initialise an object
        ArrayList<String> cars = new ArrayList<>();

        //Methods

        //Add an element at end
        cars.add("Volvo");

        //Add an element at position
        cars.add(1, "Mazda");

        //Access an element
        String firstElement = cars.get(0);
        System.out.println(firstElement);

        //Change an item
        cars.set(0, "Opel");

        //Remove an item at position
        cars.remove(0);

        //Remove all elements
        cars.clear();

        cars.add("VW");
        //Size of ArrayList
        int size = cars.size();
        System.out.println(size);

        //Loop Variations

        cars.add("Car");
        //For + Size()
        for(int i = 0; i < cars.size(); i++){
            System.out.println(cars.get(i));
        }

        //For-each
        for(String i : cars) {
            System.out.println(i);
        }

        //Sorting
        Collections.sort(cars);

        //Sort in reverse
        cars.sort(Collections.reverseOrder());
    }
}