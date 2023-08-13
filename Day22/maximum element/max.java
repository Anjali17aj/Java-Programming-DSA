import java.util.ArrayList;

public class max {
    public static void main(String args[]){
        ArrayList <Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(17);
        list.add(12);
        list.add(11);

        int max = Integer.MIN_VALUE;
        for(int i=0; i<list.size(); i++){
            if(max<list.get(i)){
                max = list.get(i);
                //or     max = Math.max(max, get(i));
            }
        }
        System.out.println("The maximum element is : "+ max);
}
}
// tc = O(n)
