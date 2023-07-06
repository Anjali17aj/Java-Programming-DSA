//Print out the sum of the numbers in the second row of the “nums” array.
//Example :
//Input - int[][] arrays = { {1,4,9},{11,4,3},{2,2,3} };
//Output - 18

import java.util.*;
public class sum {
    public static void main(String args[]){
      int arrays[][] =    {{1,4,9},
                          {11,4,3},
                           {2,2,3}};
        int sum=0;
        //sum of 2nd row elements
        for(int j=0; j<arrays[0].length; j++){  //i is 1 only for row 2
            sum+=arrays[1][j];
        }
        System.out.println("sum is : "+sum);
    }
    
}
