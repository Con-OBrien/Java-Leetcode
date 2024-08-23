package DS;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorLearning {
    public static void main(String[] args) {
        //Iterator is an object used to loop through collections like ArrayList & HashSet
        ArrayList<String> cars = new ArrayList<>();
        cars.add("Toyota");
        cars.add("BMW");
        cars.add("Audi");

        //Get Iterator
        Iterator<String> iterator = cars.iterator();

        //Print first item
        System.out.println(iterator.next());

        //Loop Collection
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        //remove
        iterator.remove();
    }
}
