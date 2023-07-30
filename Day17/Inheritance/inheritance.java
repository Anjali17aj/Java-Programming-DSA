//single level inheritance

public class inheritance{
    public static void main(String args[]){
    Fish shark = new Fish();
    shark.eat(); //eat function can be called fish because fish is a derived class of animal.
    }
}

//base class
class Animal{
    String color;
    void eat(){
        System.out.print("eats");
    }
    void breathe(){
        System.out.println("Breathe");
    }
}

//derived class/subclass
class Fish extends Animal {
    int fins;

    void swim(){
        System.out.println("Swims in water");
    }
}
