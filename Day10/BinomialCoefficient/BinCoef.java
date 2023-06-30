// Binomial Coefficient n C r = n!/r!*(n-r)!

import java.util.*;
public class BinCoef{
    public static int factorial(int n){
        int f=1;
        for(int i=1; i<=n; i++){
            f=f*i;
        }
    return f;
    }
    public static int BinCoeff(int n, int r) {
        int fact_n=factorial(n);
        int fact_r=factorial(r);
        int fact_nmr=factorial(n-r);
        int Bin_Coeff= fact_n/(fact_r*fact_nmr);
        return Bin_Coeff;
    }
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n fact number : ");
        int n=sc.nextInt();
        System.out.println("Enter r fact number : ");
        int r=sc.nextInt();
        System.out.println("The Binomial Coefficient is : "+ BinCoeff(n,r));
    }
}