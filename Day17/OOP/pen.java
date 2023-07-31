package OOP;
import java.util.*;

public class pen {
    public static void main(String args[]){
    Pen p1 = new Pen(); //Pen : class name , p1 : object name , new keyword to make a new object which gets stored in heap, Pen() : Constructor.
    p1.setColor("Green"); // calling setColor function using dot operator  to set new color.
    System.out.println(p1.color);//to access object's property/function we use dot operator with the object name.
    p1.setTip(7);       //calling setTip function using dot operator  to set a new tip.
    System.out.println(p1.tip);
    p1.color = "Royal Blue"; // changing the color .
    System.out.println(p1.color);
    }
}

class   Pen {
   String color; // property of pen given
   int tip; //property of pen

   void setColor(String newColor){ //function to set new color
     color = newColor;    // storing the value of newColor in color.
   }
   void setTip(int newTip){ //function to set new tip
    tip = newTip;
   }
}


    
