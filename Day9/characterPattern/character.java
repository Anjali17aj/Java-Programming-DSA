import java.util.*;
public class character {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
         System.out.println("Enter the number of lines you want to print");
        int n=sc.nextInt();
        char ch='a';
        for(int line=1;line<=n;line++) {
            for(int chars=1;chars<=line;chars++){
                System.out.print(ch);
                ch++;
            }
        
        System.out.println();
    }}
}