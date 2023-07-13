
public class substrings {

    public static String substringsFunc(String str, int si, int ei){
        String sbstr = "";
        for(int i=si; i<ei; i++){
            sbstr += str.charAt(i);

        }
        return sbstr;
    }
    public static void main(String args[]){
        String str = "HelloByte";
        System.out.println(str.substring(0,6)); //substring function used
    }
    
}
