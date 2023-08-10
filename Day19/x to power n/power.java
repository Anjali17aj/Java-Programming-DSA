//print x to power n
public class power {
    public static int xtopowern(int x, int n){
        if(n == 0){
            return 1;
        }
    // int xnm1 = power(x, n-1);
    // int xn = x * xnm1;
    // return xn;
    return x * xtopowern(x, n-1);
    }
    public static void main(String args[]){
    System.out.println(xtopowern(2, 10));
    }
}
