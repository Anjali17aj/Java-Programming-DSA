package OddEven;

public class oddEven {
    public static void oddOrEven(int n){
        int BitMask = 1;
        if((n & BitMask) == 0){ //if bitmask gives 0
            System.out.println(n +":"+ "It's an odd number");
        }
        else {
          System.out.println(n +":"+ "It's an even number");        //if(n & BitMask == 1){
        }
           
        }
    

    public static void main(String args[]){
    oddOrEven(17);
    oddOrEven(12);
    
}
}
