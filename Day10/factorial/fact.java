import java.util.*;
public class fact{
    public static int factorial(int n){
        int f=1;
        for(int i=1; i<=n; i++){
            f=f*i;
        }
        return f;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
       int fact=factorial(n); // function call and store the value in fact.
       System.out.println(fact);
       System.out.println(factorial(4)); //function call and finding factorial of 4.
       System.out.println("factorial of 3 is : " + (factorial(3))); //function call and finding factorial of 4.
    }
}