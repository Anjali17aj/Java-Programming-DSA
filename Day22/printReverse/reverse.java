package printReverse;

import java.util.ArrayList;

public class reverse {
     public static void main(String args[]){
        ArrayList <Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(17);
        list.add(12);
        list.add(11);

        // System.out.println(list);
        // System.out.println(list.size()); //length of array list

        for(int i=list.size() - 1; i>=0; i--){
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }
}
