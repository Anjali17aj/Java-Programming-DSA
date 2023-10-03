import java.util.*;  // is used for input and scanner class.
public class arrays{
    public static void main(String args[]){
        int marks[]=new int[10];    //int marks[] is array declaration. new int[10] creating an array using new keyword.
        Scanner sc=new Scanner(System.in); //input
        System.out.println("Enter Physics marks");
        marks[0]= sc.nextInt();     //marks[0] is a variable.
        System.out.println("Enter chemistry marks");
        marks[1]= sc.nextInt();
        System.out.println("Enter maths marks");
        marks[2]= sc.nextInt();

        System.out.println("Marks of physics : "+ marks[0]);  //output
        System.out.println("Marks of chemistry : "+ marks[1]);
        System.out.println("Marks of maths :"+ marks[2]);

        marks[1]= 99; //updating marks
        System.out.println("Updated Marks of chemistry: "+ marks[1]);

        marks[2]=marks[2] + 2;
        System.out.println("Updated Marks of maths: "+ marks[2]);

        int percentage = (marks[0] + marks[1] + marks[2]) / 3;
        System.out.println("Percentage = "+ percentage +"%");

    }
}