//import java.util.ArrayLists;
//ArrayList is an inbuilt data structure in java before using it we have to import it as it comes inside a package.
//ArrayList is a part of Java collection framework.
//WAP to add elements using ArrayList.
import java.util.*;
public class Add {
     public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(); //format of array list. Interger is a non priitive data type. size of array list can be modified.
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
       
        System.out.println(list);
    }
}
