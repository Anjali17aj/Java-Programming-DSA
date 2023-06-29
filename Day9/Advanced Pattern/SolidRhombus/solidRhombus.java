import java.util.*;
public class solidRhombus{
    public static void Rhombus(int n) {

        for(int i=1; i<=n; i++){ //outer loop

            for(int j=1; j<=(n-i); j++) {  //spaces

                     System.out.print(" ");
            }
            for(int j=1; j<=n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        }
         public static void main(String args[]) {
      Rhombus(5);
    }
}
