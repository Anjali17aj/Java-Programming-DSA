public class Hierarchical {
    public static void main(String args[]){
    Bird birdy = new Bird();
    birdy.fly();
    System.out.println("Hierarchical inheritance");
    }
}

 class Animal {
  String color;
  void eat(){
  System.out.println("Eats");
}
}

 class Mammal extends Animal {
   void walk(){
System.out.println("Eats");
   }
}

 class Bird extends Animal {
void fly(){
System.out.println("Birds fly");
   }
}

 class Fish extends Animal {
void swim(){
System.out.println("swim");
   }
}