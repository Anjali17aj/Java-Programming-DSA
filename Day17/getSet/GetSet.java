package getSet;

public class GetSet {
    public static void main(String args[]){
    Pen p1 = new Pen();
    p1.setColor("Green");
    System.out.println(p1.getColor());
    p1.setTip(7);      
    System.out.println(p1.getTip());
    p1.setColor("Royal Blue"); // changing the color .
    System.out.println(p1.getColor());
    }
}
class   Pen {
   private String color; 
   private int tip;

   String getColor(){
    return this.color;  
   }

    int getTip(){
    return this.tip;
   } 

   void setColor(String Color){ 
     this.color = Color;    
   }
   void setTip(int tip){ 
    this.tip = tip;   //this.tip ---> is class   Pen's    int tip;   and    void setTip(int tip) --> int tip is void setTip's  = tip; 
   }
}
    
