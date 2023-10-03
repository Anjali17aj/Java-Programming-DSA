package InbuiltSort;

import java.util.Arrays;   // special inbuilt sort package
public class inbuiltSorts {
    public static void printArray( int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");

        }
        System.out.println();
    }
    public static void main(String args[]){
        int arr[]={5,4,1,2,3};
        
        Arrays.sort(arr); // this will internally sort arrays.
        printArray(arr);
    }
    
}
