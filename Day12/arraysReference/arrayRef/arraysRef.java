//call by reference is used in passing arrays as arguments.
//pass by value : In a function if there are changes it is not reflected in main function
// pass by reference : in any function if we pass any value to the variable and if it get changed in that function then the changes value is reflected in your main function too
//Pass by reference refers to a mechanism where a reference to a variable is passed to a function. When a variable is passed by reference, any changes made to the variable within the function will affect the original variable outside the function, including in the calling function.

import java.util.*;  
public class arraysRef{
    public static void update(int marks[]){
        for(int i=0; i<marks.length; i++) {
        marks[i]=marks[i] + 1;
    }
    }

    public static void main(String args[]){
        int marks[]=new int[3];    //int marks[] is array declaration. new int[10] creating an array using new keyword.
        Scanner sc=new Scanner(System.in); //input
        System.out.println("Enter the marks of phy");
        marks[0]=sc.nextInt();
        System.out.println("Enter the marks of chm");
        marks[1]=sc.nextInt();
        System.out.println("Enter the marks of maths");
        marks[2]=sc.nextInt();
        update(marks);
         
        for(int i=0; i<marks.length; i++){ //print our marks
        System.out.print(marks[i]+ " ");
            }
            System.out.println();
}
}
