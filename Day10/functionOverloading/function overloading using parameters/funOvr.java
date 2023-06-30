import java.util.*;
public class funOvr{
    public static int sum(int a,int b){ //function to calc sum of 3 nums
        return a+b;
    }

    public static int sum(int a,int b,int c){ //function to calc sum of 3 nums
        return a+b+c;
    }
    public static void main(String args[]){
        System.out.println(sum(7,2));
        System.out.println(sum(1,7,2));

    }
}