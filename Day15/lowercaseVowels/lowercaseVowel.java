import java.util.*;
public class lowercaseVowel {
    public static void main(String[] args) {
        System.out.println("Enter a word(Do not use space) : ");
        String str = new Scanner(System.in).next(); //This line reads a single word (sequence of characters without spaces) from the user's input and stores it in the variable str.
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        System.out.println("count of vowels is :" + count);
    }
}
