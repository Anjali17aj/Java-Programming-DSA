import java.util.*;
public class ageprogram {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the age");
    int age=sc.nextInt();
    if(age<13) {
    System.out.println("Child");
    }
    else if(age>13 && age<18) {
    System.out.println("Teenager");
   }
    else {
     System.out.println("Adult :  You are eligible to drive and vote.");
    }
   }
}
