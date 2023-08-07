//ques>  print nums in decreasing order using recursive function.
// f(n) = n +f(n-1)

public class Recursions{
    public static void Decreasing(int n){
        if(n == 1){ //3. base case
            System.out.println(1);
            return;
        }
        System.out.print(n+" "); //1. print n i.e 10
        Decreasing(n-1);//2. call from n-1 i.e 9 till 1 
    }
   public static void main(String args[]){
     int n = 20;
     Decreasing(n);
}
}


