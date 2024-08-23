package DS;

import java.util.LinkedList;

public class LinkedListLearning {

    public static void main(String[] args) {
        //Initialisation
        LinkedList<String> cars = new LinkedList<>();

        //Add to end
        cars.add("Volvo");
        cars.add("BMW");

        //Methods

        cars.addFirst("Alfa Romeo");
        cars.addLast("Zebra");
        cars.removeFirst();
        cars.removeLast();
        cars.getFirst();
        String last = cars.getLast();
        System.out.println(last);

        //Diff to ArrayList
        //- Many objects of same type - just like ArrayList
        //- same methods, both implement List interface, can add,change,remove,clear in same way
        //1. ArrayList has regular array within, when element is added, it's in the array
        //2. LinkedList uses containers, has a link to first container & each container links to the next one
        //To add to a LinkedList - an element is placed in a new container and that one is linked to another container
        //- We should use ArrayList for storing & accessing data, Linkedlist for manipulation

    }
}
