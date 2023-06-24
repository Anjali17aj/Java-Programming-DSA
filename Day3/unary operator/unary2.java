import java.util.*;

public class unary2{
   public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the number : ");
    int a=sc.nextInt();
    int c=a++;
    System.out.println("value of a is "+a);
    System.out.println("value of c is "+c);
   }}