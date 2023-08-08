// print nums from 1 to n (increasing order)
//  print 1 to 4 then print 5
public class increase {
    public static void Increasing(int n){
        if(n == 1){ //3. base case
            System.out.print(n+" ");
            return;
        }
        
        Increasing(n-1);//2. call from n-1 i.e 9 till 1 
        System.out.print(n+" "); //1. print n i.e 10
    }
   public static void main(String args[]){
     int n = 5;
     Increasing(n);
}
}
