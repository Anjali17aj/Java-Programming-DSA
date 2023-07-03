import java.util.*;
public class largestElement{
    public static int getlargest(int numbers[]){
        int largest= Integer.MIN_VALUE; // -infinity
        for(int i=0; i<numbers.length; i++){
            if(largest<numbers[i]){
                largest=numbers[i];
            }
        }
        return largest;
    }

public static void main(String args[]){
    int numbers[] = {1,2,3,4,5,16,17,4,3,2};
    System.out.println("The value of largest is : " +getlargest(numbers));

}
}