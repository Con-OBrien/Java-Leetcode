package DS;

import java.util.HashMap;

public class HashMapLearning {
    public static void main(String[] args) {
        //HashMap store items in key/value pairs

        //Initialisation
        HashMap<String, String> capitalCities = new HashMap<>();

        //Add keys and values(Country, City)
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        System.out.println(capitalCities);

        //Access an Item
        capitalCities.get("England");

        //Remove an Item
        capitalCities.remove("Germany");

        //Remove all items
        capitalCities.clear();
        capitalCities.put("Ireland", "Dublin");

        //How many items
        int size = capitalCities.size();
        System.out.println(size);

        //Loop with for-each
        //Get the keys
        for(String i : capitalCities.keySet()){
            System.out.println(i);
        }

        //Get the values
        for(String i : capitalCities.values()){
            System.out.println(i);
        }

        //Both
        for(String i : capitalCities.keySet()){
            System.out.println("key: " + i + " value: " + capitalCities.get(i));
        }
    }
}
