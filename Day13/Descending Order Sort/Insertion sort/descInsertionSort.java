

public class descInsertionSort {
    public static void descendingInsertionSort(int arr[]) {
        for(int i=1; i<arr.length; i++) {
            int curr = arr[i];
            int prev = i-1;
            //to find the index where curr is to be inserted
            while(prev >= 0 && arr[prev] < curr) {
            arr[prev+1] = arr[prev];
            prev--;
            }
            arr[prev+1] = curr;
            }
            }
            
        public static void printArray( int arr[]){
            for(int i=0; i<arr.length; i++){
                System.out.print(arr[i] + " ");
    
            }
            System.out.println();
        }
        public static void main(String args[]){
            int arr[]={6,10,5,7,4,1,2,3};
            descendingInsertionSort(arr);
            printArray(arr);
        }
    
}
