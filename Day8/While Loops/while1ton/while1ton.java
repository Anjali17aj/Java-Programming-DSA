import java.util.*;
public class while1ton{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int counter=1;
        System.out.println("Enter the number");
        int n=sc.nextInt();
        while(counter<=n) {
            System.out.print(counter+" ");
            counter++;
        }
    }
}