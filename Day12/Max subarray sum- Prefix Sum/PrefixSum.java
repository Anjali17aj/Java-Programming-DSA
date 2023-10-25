import java.util.*;
public class PrefixSum{
public static void maxSubarraySumPrefix(int numbers[]){
    int currSum=0;
    int maxSum= Integer.MIN_VALUE;

    int prefix[] = new int[numbers.length];

    prefix[0]=numbers[0];  //zero index has sum till zero 0th  index only. only 1

    for(int i=1; i<prefix.length; i++) {
            prefix[i] = prefix[i-1] + numbers[i];  // prefix array's ith elements stores previous elements sum + the current element sum of Original array
    }

    for(int i=0; i<numbers.length; i++){
        int start=i;
        for(int j=0; j<numbers.length; j++){
        int end=j;
        currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start-1];
        
        if(currSum>maxSum){
            maxSum=currSum;
        }

    }
}
System.out.println("Maximum Subarray sum: "+ maxSum);
}
public static void main(String args[]){
    int numbers[]= {1,-2,6,-1,3};
    maxSubarraySumPrefix(numbers);

}}