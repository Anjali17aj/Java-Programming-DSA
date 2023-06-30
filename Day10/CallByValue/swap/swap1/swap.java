import java.util.*;
public class swap{
    public static void swap(int a,int b) {
        int temp=a;
        a=b;
        b=temp;
        System.out.println("Now, The values are: a="+a+" ,b="+b);
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a : ");
        int a=sc.nextInt();
        System.out.println("Enter b : ");
        int b=sc.nextInt();
        swap(a,b);
            }
}