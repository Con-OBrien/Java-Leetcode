package DS;

import java.util.HashSet;

public class HashSetLearning {
    public static void main(String[] args) {
        //Collection where every item is unique

        //Initialisation
        HashSet<String> cars = new HashSet<>();

        //add
        cars.add("Mercedes");
        cars.add("BMW");
        System.out.println(cars);

        //check exists
        boolean exists = cars.contains("Mazda");
        System.out.println(exists);

        //remove
        cars.remove("BMW");

        //clear
        cars.clear();
        cars.add("Aston Martin");

        //size
        int size = cars.size();
        System.out.println(size);

        //loop
        for(String i : cars){
            System.out.println(i);
        }

    }
}
