import java.util.*;
public class subarrays{
    public static void printSubarrays(int numbers[]){
        int ts=0;
        for(int i=0; i<numbers.length; i++){  //outer loop from 0 to array's length for start 
            int start = i;   //taking out start =start will be the numbers of i.
            
            for(int j=i;j<numbers.length; j++){ // from start to end loop where we are finding end.  j=i because we have to print single subarray also along with i+1
                int end = j;

                for(int k=start; k<=end; k++){ //print all the sub arrays from start to end.
                System.out.print(numbers[k]+" ");
            }

            ts++; // sum of n arrays= n*(n+1)/2
            System.out.println();
        }
        System.out.println();
    }

    System.out.println("total subarray : "+ ts);
}

    public static void main(String args[]){
        int numbers[]={2,4,6,8,10,12};
        printSubarrays(numbers);


    }
}