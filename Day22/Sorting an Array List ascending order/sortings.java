//Sorting an arraylist
//optimized method and an inbuilt method of java
//collections is a class in java
//collection is an interface in java

import java.util.ArrayList;
import java.util.Collections;
public class sortings {
    public static void main(String args[]){
        ArrayList <Integer> list = new ArrayList<>();
        list.add(17);
        list.add(18);
        list.add(12);
        list.add(3);
        list.add(5);

        System.out.println("The list is: " + list);
        Collections.sort(list);

        System.out.println("After sorting the list is: "+ list); //List will be sorted in ascending order.
    }
}
