//pass by reference
import java.util.*;  
public class arrayNonChange{
    public static void update(int marks[], int nonChangable){

        for(int i=0; i<marks.length; i++) {
        marks[i]=marks[i] + 1;

        nonChangable= 15; //It will not change even in update function the value is updated from 10 to 15 
    }
    }

    public static void main(String args[]){
        int marks[]=new int[3];    
        int nonChangable=10; //It will not change even in update function the value is updated from 10 to 15 
        
        Scanner sc=new Scanner(System.in); 
        System.out.println("Enter the marks of phy");
        marks[0]=sc.nextInt();
        System.out.println("Enter the marks of chm");
        marks[1]=sc.nextInt();
        System.out.println("Enter the marks of maths");
        marks[2]=sc.nextInt();
        update(marks,nonChangable);
         System.out.println("nonChangable, It will not change even in update function the value is updated from 10 to 15 :" +nonChangable);
        for(int i=0; i<marks.length; i++){ //print our marks
        System.out.print(marks[i]+ " ");
            }
            System.out.println();
            
}
}
