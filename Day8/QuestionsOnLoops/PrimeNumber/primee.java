import java.util.*;
public class primee{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        if(n==2){
            System.out.println("It's a prime number");
        } else {
            boolean isPrime=true;
            for(int i=2;i<n-1;i++)
            {
                if(n%2==0) {
                    isPrime=false;
                }
            }
            if(isPrime == true) {
            System.out.println("number is a prime ");
            } else {
                 System.out.println("number is a not a prime");
                    }
        }
            }
        }