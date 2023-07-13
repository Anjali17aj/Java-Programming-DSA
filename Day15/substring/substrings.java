import java.util.*;
public class substrings {
    public static String substringOfString(String str, int si , int ei){
        String sb = "";
        for (int i = si; i < ei ; i++){
            sb += str.charAt(i);
        }
        return sb;
    }
    public static void main(String args[]){
        String str = "HelloWorld";
        System.out.println(substringOfString(str, 0 ,5));

    }
    
} 
