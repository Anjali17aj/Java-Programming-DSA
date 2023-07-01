import java.util.*;
public class Fcalls {
    public static void calculateSum() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the 1st number");
        int a = sc.nextInt();
        System.out.println("Enter the 2nd number");
        int b = sc.nextInt();
        int sum=a+b;
        System.out.println("The sum is: "+sum);
    }
    public static void main(String args[]) {
        calculateSum();
    }
}