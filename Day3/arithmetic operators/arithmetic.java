import java.util.*;

public class arithmetic{
   public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter 1st number : ");
    int a=sc.nextInt();
    System.out.println("Enter 2nd number : ");
    int b= sc.nextInt();
    int add=a+b;
    System.out.println("The sum is: "+add);

    int subtract =a-b;
    System.out.println("The difference is: "+subtract);

    int Multiply=a*b;
    System.out.println("The product is: "+Multiply);

    int div=a/b;
    System.out.println("The division is: "+div);

    int modulo=a%b;
    System.out.println("The remainder is: "+modulo);

   }
}