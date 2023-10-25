
import java.util.*;
public class parameterfcall {
    public static int calculateSum(int num1, int num2) { //int num1 & num2 are function definition and are called formal parameters
        int sum = num1 + num2; //this sum variable is different which resides in calculateSum function
       return sum;
    }
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the 1st number");
        int a = sc.nextInt();
        System.out.println("Enter the 2nd number");
        int b = sc.nextInt();
        int sum= calculateSum(a,b); //this sum variable is different which resides in main function. int a & b are arguments and are called actual parameters
        System.out.println("The sum is: "+sum);
    }
}