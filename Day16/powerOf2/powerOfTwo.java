
public class powerOfTwo {
    public static boolean ispowerOfTwo(int n){
        return (n&(n-1)) == 0;

    }
    public static void main(String args[]){
        System.out.println(ispowerOfTwo(8));

    }
    
}
