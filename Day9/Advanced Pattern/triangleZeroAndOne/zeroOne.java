import java.util.*;
public class zeroOne{
    public static void Zero_One_Triangle(int n) {
         int counter=1;
        for(int i=1; i<=n; i++){ //outer loop - total no. of  lines 

            for(int j=1; j<=i; j++) {   //inner loop - how many numbers will be printed. i times
            if((i+j)%2==0){ //even
              System.out.print("1");
            } else {
                System.out.print("0");
            }
                }
                    System.out.println();
        }
    }
    public static void main(String args[]) {
     Zero_One_Triangle(5); //value of n
    }
}
