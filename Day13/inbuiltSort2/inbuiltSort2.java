package inbuiltSort2;

import java.util.Arrays;

public class inbuiltSort2 {
    public static void printArray(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int arr[]={6,5,4,3,1,2};
        Arrays.sort(arr,0,3); //  Sorting from 0 to 2  Note: ending index is non-inclusive. Therefore, include index 3 also.
        printArray(arr);
    }
}
