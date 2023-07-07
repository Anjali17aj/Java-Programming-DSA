package lettersUppercase;

public class uppercases {

    public static String uppercaseLetters(String str){
        StringBuilder sb = new StringBuilder("");
        Character ch = Character.toUpperCase(str.charAt(0)); // zeroth place character converted into uppercase and stored in ch.
        sb.append(ch); //ch will be append/copied in the sb
        for(int i=1; i<str.length(); i++){
            if(str.charAt(i) == ' ' && i<str.length()-1){ //if character at i is equal to empty and character at i is less than n-1(last string)
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i))); //character at ith place is changing into uppercase which gets append into sb.
           }
           else
           sb.append(str.charAt(i));
        }
        return sb.toString();
    } 
    public static void main(String args[]){
        String str = "Hello peeps, my name is anjali kumari.";
        System.out.println(uppercaseLetters(str));
    }
    
}

//As much string length that much of time taken so Time complexity O(n)
