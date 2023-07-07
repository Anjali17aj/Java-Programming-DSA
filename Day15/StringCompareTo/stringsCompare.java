
public class stringsCompare {
    public static void main(String args[]){
        String fruits[] = {"apple", "mango" ,"banana", "grapes", "papaya"};
        String largest = fruits[0]; // for largest string let's suppose our 1st string is the largest one.
        for(int i = 0; i<fruits.length; i++){
         if(largest.compareTo(fruits[i])<0){ //if our largest is less than fruits of i
            largest = fruits[i];
           
         }
        }
          System.out.println(largest);
    }
    
}
