
public class compare {
        public static void main(String args[]){
            String s1 = "Tika";
            String s2 = "Tika";
            String s3 = new String("Tika");

            if(s1 == s2){ // old string location check... values check
                System.out.println("Strings are equal");
            } else {
                System.out.println("Strings are not equal");
            }

            if(s1 == s3) {// old and new string value compared. 
                System.out.println("Strings are equal");
            } else {
                System.out.println("Strings are not equal");
            }
            }
        }        