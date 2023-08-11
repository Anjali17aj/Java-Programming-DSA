package FindSubsets;
public class FindSubsets {
    public static void printSubsets(String str, String ans, int i){
        //base case
     if(i == str.length()){
        if(ans.length() == 0){
            System.out.println("null");
        } else {
         System.out.println(ans);
        }       
        return;
     }
        //choice yes
        printSubsets(str, ans+str.charAt(i), i+1);
        //choice no
        printSubsets(str, ans, i+1);
    }
    public static void main(String args[]){
        String str = "pqr";
         printSubsets(str, "", 0);
    }
}
