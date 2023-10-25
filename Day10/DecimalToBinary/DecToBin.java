
public class DecToBin{
    public static void decimalToBinary(int n){
        int myNum=n;
        int pow=0;
        int bin=0;

        while(n>0) {
           int rem= (n % 2); //remainder
           bin=bin+(rem*(int)Math.pow(10,pow));
           pow++;
           n = n/2; //quotient
        }
        System.out.println("binary form of " + myNum + " = " +bin);

    }
    public static void main(String args[]){
        decimalToBinary(7);

    }
}