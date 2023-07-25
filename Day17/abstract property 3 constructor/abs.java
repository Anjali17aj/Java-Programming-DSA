
public class abs {
    public static void main(String args[]){
        Penguin pn1 = new Penguin();
        // h1.eat();
        // h1.walk();
        // System.out.println(h1.color);
        // Penguin p1 = new Penguin();
        // p1.eat();
        // p1.walk();

    }
}
abstract class Animal { //we cant create objects in main function using abstract animal class.
    String color;

    Animal(){
        color = "brown";
        System.out.println("Animal constructor called");
    }
    void eat(){
        System.out.println("animal Eats");
    }


abstract void walk(); // abstract methods doesn't have any implementations. idea by Animal class which is to be implemented in horse and penguin class is the concept of abstraction.
}

 class Horse extends Animal { //walk to be implemented in horse class
    Horse(){
        System.out.println("Horse constructor called");
    }
    void changeColor(){
      color = "dark brown";
    }
    void walk(){
        System.out.println("Walks on 4 legs.");
    }

 }

 class Ostrich extends Horse{
    Ostrich(){
        System.out.println("Ostrich constructor called");
    }
 }

 class Penguin extends Ostrich { //walk to be implemented in horse class
    Penguin(){
        System.out.println("Penguin constructor called");
    }
    void changeColor(){
        color = "black";
    }
    void walk(){
        System.out.println("Walks on 2 legs.");
    }

 }
