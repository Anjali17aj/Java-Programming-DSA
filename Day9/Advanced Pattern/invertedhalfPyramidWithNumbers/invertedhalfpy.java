
import java.util.*;
public class invertedhalfpy{
    public static void invertHalf_py(int n) {

        for(int i=1; i<=n; i++){ //outer loop

            for(int j=1; j<=n-i+1; j++) {  

                     System.out.print(j+ " ");

                }
                    System.out.println();
        }
    }
    public static void main(String args[]) {
     invertHalf_py(5);
    }
}
