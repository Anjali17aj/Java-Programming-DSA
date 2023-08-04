public class supers {
    public static void main(String args[]){
    Horse h = new Horse(); //after creating this object automatically horse's constructor is called and then because of super keyword animal's constructor is called.
    System.out.println(h.color);
    }
}

class Animal {
    String color;
    Animal(){
        System.out.println("Animal constructor is called");
    }
}

class Horse extends Animal {
    Horse() {
        super.color = "Brown";
        // super(); //animal class's constructor is called Note: java bydefault calls super class.
     System.out.println("Horse constructor is called");
    }
    
}