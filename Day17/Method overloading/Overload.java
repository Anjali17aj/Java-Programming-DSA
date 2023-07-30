//method overloading.

public class Overload {
  public static void main(String args[]){
  Calculator calc = new Calculator();
  System.out.println(calc.sum(1, 2));
  System.out.println(calc.sum((float)17.5, (float)12.5)); //by default java has taken 1.5 as double so we type cast it into  float.
  System.out.println(calc.sum(1, 2, 3));
  }
    
}
class Calculator {
    int sum( int a, int b) {
        return a+b;
    }
    float sum( float a, float b){
        return a+b;
    }
    int sum (int a, int b, int c){
       return a+b+c;
    }
}
