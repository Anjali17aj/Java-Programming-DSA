import java.util.*;
public class HollowRect{
    public static void hollow_rectangle(int totrows, int totcols) {
        for(int i=1; i<=totrows; i++){ //outer loop
            for(int j=1; j<=totcols; j++) {  //inner columns
                if(i==1 || i==totrows || j==1 || j==totcols)  { //cell (i,j)
                     System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
        System.out.println();
        }
    }
    public static void main(String args[]) {
      hollow_rectangle(4,5); //size of rows, cols
    }
}