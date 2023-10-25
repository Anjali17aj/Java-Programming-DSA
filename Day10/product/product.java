import java.util.*;
public class product{
    public static int multiply(int a, int b){
      int prod= a*b;
      return prod;
    }
     
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a : ");
        int a =sc.nextInt();
        System.out.println("Enter b : ");
        int b =sc.nextInt();
         int prodOfTwoNums= multiply(a,b);
         System.out.println("Product of two numbers a*b = "+ prodOfTwoNums);
         prodOfTwoNums= multiply(17,10);
         System.out.println("Product of two numbers a*b i.e 17*10= "+ prodOfTwoNums);

    }
}