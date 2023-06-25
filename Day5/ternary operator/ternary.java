import java.util.*;
public class ternary {
    public static void main (String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        String s= ((n%2)==0) ? "Even" : "ODD";
        System.out.println("The number is " +s);
    }}