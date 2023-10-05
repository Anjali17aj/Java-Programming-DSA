//Same question: sum of a diagonal matrix i.e Sum of primary and seconday diagonals.
// linear approach- Time complexity : O(n)

import java.util.*;
public class diagonalSum {
    public static int diagonalMatrixSum(int matrix[][]){
    int sum=0;
    for(int i=0; i<matrix.length; i++){  
        //Primary Diagonal     
            sum+=matrix[i][i];
        //Secondary Diagonal 
        if(i != matrix.length-i-1){
          sum+=matrix[i][matrix.length-i-1];
        }
        }
    
    return sum;
}
public static void main(String args[]){
    int matrix[][] = {{1, 2, 3, 4},
                      {5, 6, 7, 8},
                      {9, 10, 11, 12},
                      {13, 14, 15, 16}};

            System.out.println(diagonalMatrixSum(matrix));
}
}