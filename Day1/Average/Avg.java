import java.util.*;
public class Avg {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int Avg= a+b+c/3;
        System.out.println("The average is:"+Avg);
    }
}