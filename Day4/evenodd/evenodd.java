import java.util.*;
public class evenodd {
   public static void main(String args[]) {
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the 1st number");
    int number = sc.nextInt();

    if(number % 2 == 0) {
        System.out.println("EVEN");
    } else {
        System.out.println("ODD");
    }
   }}