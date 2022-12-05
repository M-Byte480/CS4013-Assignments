import model.LineItem;

import java.util.ArrayList;
import java.util.Arrays;

public class Driver {
    public static void main(String[] args) {
        String name = "Milan";
        String description = "handsome";
        ArrayList<String> producstOfRestaurant = new ArrayList<>();
        double cost = 2.2;
        producstOfRestaurant.add("This");
        producstOfRestaurant.add("Hello");
        System.out.println(Arrays.toString(new String[] {name, description, cost + "", String.join( "-", producstOfRestaurant)}));
    }
}
