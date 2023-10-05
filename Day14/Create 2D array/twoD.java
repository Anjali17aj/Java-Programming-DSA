import java.util.*;

public class twoD {
    public static void main(String args[]){
        int matrix[][]= new int[3][3]; // cells= rows*columns and we can store 9 intergers.
        int n=matrix.length, m=matrix[0].length;

          Scanner sc = new Scanner(System.in); 
          System.out.println("Enter the numbers :");
            for(int i=0; i<n; i++){
                for(int j=0; j<m; j++){
                    
                    matrix[i][j] = sc.nextInt(); //access matrix  
                }
            }
        
        //output
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
            System.out.print(matrix[i][j] + " ");

     }
    System.out.println();
    }
}
}
// while running the program while inputing use spaces btw the nums