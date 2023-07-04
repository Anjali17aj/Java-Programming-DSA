

public class selection {
    public static void printArray( int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");

        }
        System.out.println();
    }

    public static void selectionSorting(int arr[]){
    
        for(int i=0; i<arr.length-1; i++){
            int minElement=i;
            for(int j=i+1; j<arr.length; j++){
            if(arr[minElement] > arr[j]){
                minElement=j;
            }
        }
        //swap
        int temp= arr[minElement];
        arr[minElement] = arr[i];
        arr[i] = temp;

    }
}
    
    public static void main(String args[]){
        int arr[] = {5,4,1,3,2};
        selectionSorting(arr);
        printArray(arr);

    }
}
