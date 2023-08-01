import java.util.ArrayList;

public class swap {
    public static void swap(ArrayList<Integer> list, int idx1, int idx2){
       int temp = list.get(idx1);
       list.set(idx1, list.get(idx2)); //idx1 will get the new value of idx2
       list.set(idx2, temp);

    }
    public static void main(String args[]){
        ArrayList <Integer> list = new ArrayList<>();
        list.add(17);
        list.add(12);
        list.add(7);
        list.add(10);
        list.add(5);

        int idx1 = 1;  //index 1
        int idx2 = 3;   //index 3

        System.out.println(list);
        swap(list, idx1, idx2);
        System.out.println(list);
    }
}
