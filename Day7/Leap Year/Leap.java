import java.util.* ;
public class Leap {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the year: ");
        int year=sc.nextInt();
        boolean x= (year%4) ==0; //when year is divided by 4 and assigns the result to the boolean variable x. It checks if the year is divisible by 4.
        boolean y= (year%100) !=0; //This line checks if the year is not divisible by 100 and assigns the result to the boolean variable y.
        boolean z= ((year%100==0) && (year%400==0)); //year is divisible by 100 and also divisible by 400, assigning the result to the boolean variable z. 
 //This condition accounts for exceptions to the rule that years divisible by 100 are not leap years, except for years divisible by 400.
        if(x&& (y||z)) {
            System.out.println(year+" is a leap year");
            } else {
                System.out.println(year+" is not a leap year");
                }
                }
                }