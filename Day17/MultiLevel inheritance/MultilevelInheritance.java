
public class MultilevelInheritance {
    public static void main(String args[]){
        Dog doggy = new Dog();
    doggy.eat(); //eat function can be called fish because fish is a derived class of animal.
    doggy.legs = 4;
    System.out.println(doggy.legs);
    }
}

//base class
class Animal{
    String color;
    void eat(){
        System.out.println("eats");
    }
    void breathe(){
        System.out.println("Breathe");
    }
}

//derived class/subclass
class Mammal extends Animal {
    int legs;

    
}

class Dog extends Mammal {
    int breed;
}
