public class interning{
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = new String("hello"); // Creates a new string object (not from the string pool)
        String str3 = str2.intern(); // Gets the reference to the interned string from the pool
        System.out.println(str1 == str2); // Output: false (different instances)
        System.out.println(str1 == str3); // Output: true (both point to the same interned string)
    }
}
