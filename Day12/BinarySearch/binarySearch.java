//binary search is done on sorted arrays. either numbers are in ascending order or in descending order.

import java.util.*;
public class binarySearch{
    public static int BinaryS(int numbers[], int key){
        int start=0;
        int end=numbers.length-1;

        while(start<=end){ //loop will work untill (start is also a key, mid is also a key, end is also a key) when we are comparing with a single element.
            int mid = (start + end) / 2;

            //comparisons
            if(numbers[mid] == key) {
                return mid;  //key is found at the mid index
            }
            if(numbers[mid]<key){
               start = mid+1;
            } else {
               end = mid-1;
            }

        }
        return -1;
    }
    public static void main(String args[]){
        int numbers[]={ 1,4,5,6,8,10,12,16,17};
        int key = 17;

        System.out.println("The key was found at index : "+ BinaryS(numbers, key) );

    }
}


