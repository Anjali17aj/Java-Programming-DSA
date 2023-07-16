public class updateithBit{

    public static int clearithBit(int n, int i){
        int bitMask = ~(1<<i);
     return n & bitMask;
}
    public static int updateith(int n, int i, int newBitMask){
    //    if(newBitMask == 0){
    //     return Clearith(n, i);
    //    }else {
    //     return setithBit(n, i);
    //    }
    //    }
     clearithBit(n ,i);
    int BitMask = newBitMask<<i;
    return n | BitMask;
    }
  public static void main(String args[]){
     System.out.println(updateith(10, 2, 1));  //10, 3

 }
}
