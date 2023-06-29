import java.util.*;
public class invertedpyramid{
    public static void invertRot_py(int n) {

        for(int i=1; i<=n; i++){ //outer loop

            for(int j=1; j<=n-i; j++) {  //spaces

                     System.out.print(" ");

                }
                for(int j=1; j<=i; j++)  {

                    System.out.print("*");
                }
            
        System.out.println();
        }
    }
    public static void main(String args[]) {
      invertRot_py(4);
    }
}
