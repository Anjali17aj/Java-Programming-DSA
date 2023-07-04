
public class insertions{
    public static void inserting(int arr[]){
        for(int i=1;i<arr.length;i++){
        int curr=arr[i];
        int prev=i-1;
        //finding out the correct position to insert
        while(prev>=0 && arr[prev]>curr){    // if you change to this  arr[prev]<curr   then it will be changed to descending order
        arr[prev+1]=arr[prev];
        prev--;
      }
      //insertion.
      arr[prev+1]=curr;
    }

    }
    public static void printArray( int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");

        }
        System.out.println();
    }
    public static void main(String args[]){
        int arr[]={5,4,1,2,3};
            inserting(arr);
            printArray(arr);
              
        }
    }