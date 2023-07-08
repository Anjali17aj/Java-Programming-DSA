import java.util.Scanner;

public class stringChar {
   public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    String firstName;
    String LastName;
    
    System.out.print("Enter a First name : ");
    firstName = sc.nextLine();
    System.out.print("Enter a Last name : ");
    LastName = sc.nextLine();
    String Fullname = firstName + " " + LastName;
    System.out.println("Name is : "+ Fullname);
    System.out.println("Length of name : " + Fullname.length());
    System.out.println(Fullname.charAt(7)); //to find character at a particular index


   }
    
}
