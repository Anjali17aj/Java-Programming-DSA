import java.util.*;
public class floyd{
    public static void floyds_Triangle(int n) {
         int counter=1;
        for(int i=1; i<=n; i++){ //outer loop - how many lines needed ?

            for(int j=1; j<=i; j++) {   //inner loop - how many times will the counter be printed.

                     System.out.print(counter+ " ");
                     counter++;

                }
                    System.out.println();
        }
    }
    public static void main(String args[]) {
     floyds_Triangle(10); //value of n
    }
}
