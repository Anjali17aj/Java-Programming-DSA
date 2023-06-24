public class solve3 {
    public static void main(String[] args){
        int x = 2, y = 5;
        int exp1 = (x * y / x); //2*5/2 =5.
        double exp2 = (x * (float)(y / x)); // 2*5/2 =2*2.5  =2*2=4 taking int values.
    
        System.out.print(exp1 + ",");
        System.out.print(exp2);
       
        }
        }