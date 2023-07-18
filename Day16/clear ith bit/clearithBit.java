
public class clearithBit {
   public static int Clearith(int n, int i){
           int bitMask = ~(1<<i);
        return n & bitMask;
   }

    
    public static void main(String args[]){
        System.out.println(Clearith(10, 1)); //10, 3

    }
}
    

