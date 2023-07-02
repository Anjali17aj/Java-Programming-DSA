import java.util.*;
   public class avg{
    public static int average(int p, int c, int m){
        int avrg= p+c+m/3;
        return avrg;
    }


    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter marks of p");
        int p= sc.nextInt();
        System.out.println("Enter marks of c");
        int c= sc.nextInt();
        System.out.println("Enter marks of m");
        int m= sc.nextInt();
        int averageMarks = average(p,c,m);
        System.out.println("The average is : " + averageMarks );

   }



}