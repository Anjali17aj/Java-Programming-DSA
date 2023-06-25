import java.util.*;
public class largest {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the 1st number");
    int n1=sc.nextInt();
    System.out.println("Enter the 2nd number");
    int n2=sc.nextInt();
    if(n1>n2)
    {
        System.out.println("n1 is the largest of 2");
        System.out.println("n1>n2");

    }
    else {
        System.out.println("n2 is the largest of 2");
        System.out.println("n1<n2");
    }
   }}