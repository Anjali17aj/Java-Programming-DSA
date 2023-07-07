import java.util.*;
public class charAt2 {
   public static void printLetters(String Fullname){
    for(int i=0; i<Fullname.length(); i++){
        System.out.print(Fullname.charAt(i) + " ");
    }
    System.out.println();
   }
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
    
    printLetters(Fullname);

   }
    
}
