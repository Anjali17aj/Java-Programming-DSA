
import java.util.*;
public class parametersFcalls {
    public static void calculateSum(int num1, int num2) { //int num1 & num2 are function definition and are called formal parameters
        int sum = num1 + num2;
        System.out.println("The sum is: "+sum);
    }
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the 1st number");
        int a = sc.nextInt();
        System.out.println("Enter the 2nd number");
        int b = sc.nextInt();
        calculateSum(a,b);
    }
}