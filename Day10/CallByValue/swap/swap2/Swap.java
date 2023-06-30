import java.util.*;
public class Swap{
    public static void swap(int a,int b) {
        int temp=a;
        a=b;
        b=temp;
        
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a : ");
        int a=sc.nextInt();
        System.out.println("Enter b : ");
        int b=sc.nextInt();
        swap(a,b);
        System.out.println("The values are: a="+a+" ,b="+b); // both are different functions value is copied in swap function but the output is printed in main function so same original value will be printed as an output
            }
}