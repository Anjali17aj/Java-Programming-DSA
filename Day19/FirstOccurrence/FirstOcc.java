//Write a function to find FirstOccurrence of an element in an array.
// Time and space complexity is O(n)

public class FirstOcc {
    public static int FirstOccurrence(int arr[], int key, int i){
        if(i == arr.length){
            return -1;
        }
        if( arr[i] == key){
            return i;
        }
        return FirstOccurrence(arr, key, i+1);
    }
    public static void main(String args[]){
        int arr[] = {8, 3,6, 9, 5, 10, 2, 5, 5};
        System.out.println(FirstOccurrence(arr, 5, 0));
    }
}
