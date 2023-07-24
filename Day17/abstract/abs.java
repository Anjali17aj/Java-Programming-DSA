public class abs {
    public static void main(String args[]){
        Horse h1 = new Horse();
        h1.eat();
        h1.walk();
        Penguin p1 = new Penguin();
        p1.eat();
        p1.walk();

    }
}
abstract class Animal { //we cant create objects in main function using abstract animal class.
    void eat(){
        System.out.println("animal Eats");
    }


abstract void walk(); // abstract methods doesn't have any implementations. idea by Animal class which is to be implemented in horse and penguin class is the concept of abstraction.
}

 class Horse extends Animal { //walk to be implemented in horse class
    void walk(){
        System.out.println("Walks on 4 legs.");
    }

 }

 class Penguin extends Animal { //walk to be implemented in horse class
    void walk(){
        System.out.println("Walks on 2 legs.");
    }

 }