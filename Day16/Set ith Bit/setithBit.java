
public class setithBit {
    
    public static int settingithBit(int n, int i){

        int bitMask = 1<<i;

        return n | bitMask;

        }

    
    public static void main(String args[]){
        System.out.println(settingithBit(10, 2)); //10, 3

    }
    
}

    

