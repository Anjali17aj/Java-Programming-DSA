/* 
217. Contains Duplicate - LeetCode    easy    [company - Amazon]
Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

*/
import java.util.*;

public class DuplicateChecker {

    public static boolean containsDuplicate(int nums[]) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 1}; // Example input array

        boolean containsDup = containsDuplicate(nums); //stores true or false.

        if (containsDup) { //statement to determine whether the containsDup variable is true or false.
            System.out.println(containsDup  +" "+ "The array contains duplicate elements.");
        } else {
            System.out.println(containsDup +" "+ "The array does not contain duplicate elements.");
        }
    }
}
