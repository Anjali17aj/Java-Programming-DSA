// Print the number of 7’s that are inthe 2d array.
//Example :Input - int[][] array = { {4,7,8},{8,8,7} };Output - 2
 

public class numbers {
    public static void main(String args[]){
        
        int arrays[][] = {{4, 7, 8},
                          {8, 8, 7}};
            int countOf7 = 0;

        for(int i=0; i<arrays.length; i++){ //row
           for(int j=0; j<arrays[0].length; j++){ //column
            if(arrays[i][j] == 7){
                countOf7++;
            }
           }
        }
        System.out.println("count of 7 is :- " + countOf7 );
    }
    
}
