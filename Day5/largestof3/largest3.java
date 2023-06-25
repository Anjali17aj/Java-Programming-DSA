import java.util.*;
public class largest3 {
    public static void main (String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter the 1st number");
        int a= sc.nextInt();
        System.out.println("Enter the 2nd number");
        int b= sc.nextInt();
        System.out.println("Enter the 3rd number");
        int c=sc.nextInt();
        if(a>b && a>c) {
        System.out.println("A is the largest number");
        }
        else if(b>c) {
        System.out.println("B is the largest number");
        }
        else { 
        System.out.println("C is the largest number");
        }

    }
}