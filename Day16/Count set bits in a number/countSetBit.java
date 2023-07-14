//Question : To Count set bits in a number.
// company : Google and Amazon

public class countSetBit {
    public static int countSetBits(int n){
        int count = 0; //counter will increase if 1 comes in LSB 
        while(n>0){  //loop will run till the number is greater than 0
            if((n&1) != 0){ // to check our least significant bit
                count++;  //counter increased in case of LSB is 1.
            }
              n = n>>1;  // n right shift 1 stored in n
            
        }
        return count;

    }
     public static void main(String args[]){
        System.out.println(countSetBits(10));
     }
    
}
