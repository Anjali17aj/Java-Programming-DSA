// java collections basic1
import java.util.Arrays;
import java.util.Collections;
public class basicCollection {
    public static void printArray(Integer arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] +" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        Integer arr[]={5,4,3,6,9,1,2};
        Arrays.sort(arr,Collections.reverseOrder());
        printArray(arr);
    }
}
