import java.util.*;

public class Bill{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the price of pen");
        float pen = sc.nextFloat();
        System.out.println("Enter the price of pencil");
        float pencil = sc.nextFloat();
        System.out.println("Enter the price of eraser");
        float eraser = sc.nextFloat();
        float Tcost = pen+pencil+eraser;
        System.out.println("The total cost is : "+Tcost);
        System.out.println("Now Enter GST Tax:");
        float GST = sc.nextFloat();
        float GSTC = GST*100/Tcost;
        System.out.println("The total cost including GST is : "+GSTC);

    }
}