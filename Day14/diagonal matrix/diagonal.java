//sum of a diagonal matrix i.e Sum of primary and seconday diagonals.

import java.util.*;
public class diagonal {
    public static int diagonalMatrixSum(int matrix[][]){
    int sum=0;
    for(int i=0; i<matrix.length; i++){
        for(int j=0; j<matrix[0].length; j++){
            if(i==j){
                sum+=matrix[i][j];
            }
            else if(i+j ==  matrix.length-1){
                sum+=matrix[i][j];
            }
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

// Time complexity: O(n^2) It's a brute force approach 