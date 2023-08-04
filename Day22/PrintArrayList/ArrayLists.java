import java.util.ArrayList;
public class ArrayLists {
    public static void main(String args[]){
        ArrayList <Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(17);
        list.add(12);
        list.add(11);

        System.out.println("List is" + list);
        System.out.println("length of array :" + list.size()); //length of array list

        for(int i=0; i<list.size(); i++){ //iteration-> printing array list
            System.out.println(list.get(i) + " ");
        }
        System.out.println();
    }
}
