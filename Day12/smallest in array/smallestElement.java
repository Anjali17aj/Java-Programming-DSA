//time complexity is big O of n i.e "Big O(n)" Because n numbers of operations in loop is done. n numbers
import java.util.*;
public class smallestElement{
    public static int getSmallest(int numbers[]){
        int Smallest= Integer.MAX_VALUE; // +infinity
        for(int i=0; i<numbers.length; i++){
            if(Smallest > numbers[i]){
                Smallest=numbers[i];
            }
        }
        return Smallest;
    }

public static void main(String args[]){
    int numbers[] = {12,2,3,4,5,16,7,4,3,17};
    System.out.println("The value of Smallest is : " +getSmallest(numbers));

}
}