
  import java.util.*;
public class IdxAdd {

     public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(); //format of array list. Interger is a non priitive data type. size of array list can be modified.
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
       System.out.println(list);
       
        list.add(1,12); //adding 12 at index 1
        System.out.println(list);
    }
}
