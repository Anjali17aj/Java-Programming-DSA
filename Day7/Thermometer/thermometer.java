import java.util.*;
public class thermometer {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a temperature");
        double temp=sc.nextDouble();
        if(temp>100) {
        System.out.println("You are suffering from Fever. Please consult a Doctor.");
        }
        else {
             System.out.println("You are Okay.Don't worry.");
        }
    }}