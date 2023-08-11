//2D matrix
public class GridWays {
    public static int gridWays(int i, int j, int n, int m){
        //base case
        if(i==n-1 && j==m-1) {  // n-1 and m-1 is target
            return 1;
        } else if(i == n || j == n) { // n is out side grid.
             return 0;
        }
        //recursive function
       int w1 = gridWays(i+1, j, n, m);
       int w2 = gridWays(i, j+1, n, m);
       return w1+w2;
    }
    public static void main(String args[]){
        int n=3, m=3;
        System.out.println(gridWays(0, 0, n, m));

    }
}

//tc = 2 to the power n+m.
//not an optimized code.
