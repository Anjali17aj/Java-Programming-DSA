//overriding - parent and derived class have same function but different work.
public class overriding {
   public static void main(String args[]){
    Deer d1 = new Deer(); //child class object created that's why child class output will be generated
    d1.eat();

   }
}
class Animal{
    void eat(){
        System.out.println("Eats anything");
    }
}
class Deer extends Animal{
    void eat(){
        System.out.println("Eats Grass");
    }
}