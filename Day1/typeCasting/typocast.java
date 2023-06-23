//explicit/narrowing conversion

import java.util.*;

public class typocast{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        float c = 12.17f;
        int a = (int) c;
        System.out.println(a); //data loss
    }
}