//Max subarray sum : Brute force

import java.util.*;
public class maxSubarraySum{
     public static void maximumSubarraySum(int numbers[]){
        int maxSum = Integer.MIN_VALUE;
        int currSum=0;

        for(int i=0; i<numbers.length; i++){  //start loop
            int start = i;

            for(int j=i; j<numbers.length; j++){ //end loop- making of subarrays
                int end = j;

                currSum=0;

                for(int k=start; k<=end; k++){ // loop to take out all the subarrays 
                    currSum += numbers[k]; //repeated sub array's sum calc and stored at currSum
                    }
                    System.out.println(currSum); //sum of all sub arrays
                    if(currSum>maxSum){  //compare both if currsum is greater then 
                        maxSum=currSum; //store currsum in maxsum
                    }
            }
        }
                    System.out.println("maximum sum is :" + maxSum);
                 }

    public static void main(String args[]){
        int numbers[]={2,4,6,8,10}; //array
        maximumSubarraySum(numbers); // function call
    }
}

//3 nested loop taken which goes till n. therefore time complexity is n cube big o of n cube i.e  O(3) which is a bad time complexity.
// this was a brute force method which had bad time complexity but the optimized approach to this maxsubarray sum is prefix sum approach.