public class cleariBits {
    
    public static int cleariBit(int n, int i){
     int BitMask = (~0)<<i;
     return n & BitMask;
    }
    public static void main(String args[]){
        System.out.println(cleariBit(15, 2));  //10, 3
   
    }
   }
