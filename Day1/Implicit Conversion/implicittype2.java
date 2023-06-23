import java.util.*;

public class implicittype2 {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        //int num = sc.nextFloat(); //we cannot assign float in a integer
        float num = sc.nextInt(); //but we can assign int in a float. Bcz of size float's size is larger than int.
        System.out.println(num);
    }
}