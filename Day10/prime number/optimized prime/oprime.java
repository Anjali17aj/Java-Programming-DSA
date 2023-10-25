//optimized code for checking a prime no. (root n i.e math.sqrt(n) is used so that the 
//factors doesn't get repeated and we get unique factors.)

import java.util.*;
public class oprime {
     public static boolean isPrime(int n){
        if(n==2) {
            return true;
        }
        for(int i=2; i<Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
    return true;
    }
public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number :");
        int n=sc.nextInt();
        System.out.println(isPrime(n));
        
    }
}