//fibonaacci N = fibonacci n-1 + fibonacci n - 2;

public class fibonacci {
    public static int Fibs(int n){
        if(n == 0 || n == 1){
            return n;
        }
    int fnm1 =  Fibs(n-1); //1
    int fnm2 = Fibs(n-2); //2
    int fn = fnm1 + fnm2;
    return fn;
    }
    public static void main(String args[]){
    int n = 25;
    System.out.println(Fibs(n));
    }
    
}
