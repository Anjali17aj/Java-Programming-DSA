package QuickSort;

public class DividenConquer {
    public static void printArr(int arr[]){
        for( int i=0 ; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void quickSort(int arr[], int si, int ei){ //recursion function
        if(si>=ei){
            return;
        }
    //last element
   int pIdx = partition(arr, si, ei); //getting pivot index through partition
   quickSort(arr, si, pIdx-1); //left part sorting
   quickSort(arr, pIdx+1, ei);//right part
    }
    public static int partition(int arr[], int si, int ei){
     int pivot = arr[ei];
     int i = si - 1; // to make place for elements smaller than pivot.

     for(int j=si; j<ei; j++){ //analysing elements smaller than pivot via comparision
        if(arr[j] <= pivot){
            i++;
            //swap
            int temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;

        }
     }
      i++;
            int temp = pivot;
            arr[ei] = arr[i]; //change is in pivot's index not in pivot variable.
            arr[i] = temp;
            return i;


    }

    public static void main(String args[]) {
        int arr[] = {6, 3, 9 ,8 ,2 ,5};
        quickSort(arr, 0, arr.length-1);
        printArr(arr);
    }
}
