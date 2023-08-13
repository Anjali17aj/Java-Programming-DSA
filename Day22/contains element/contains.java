import java.util.ArrayList;
public class contains {
        public static void main(String args[]){
            ArrayList <Integer> list = new ArrayList<>();
            //add operation
            list.add(1);
            list.add(2);
            list.add(3);
            list.add(4);
            list.add(5);
           
            System.out.println(list);
    
            //get operation
            // int Element = list.get(3);
            // System.out.println(Element);
    
            //remove element operation.
            // list.remove(2);
            // System.out.println(list);
    
            //set operation
            // list.set(2, 10);
            // System.out.println(list);
            
    //contains
    System.out.println(list.contains(1));
    System.out.println(list.contains(17));

}
    }
