package StringBuilder;

public class stringsBuilder {
    public static void main(String args[]){
        StringBuilder sb = new StringBuilder("");
        for(char ch='a'; ch<='z'; ch++){
            sb.append(ch);  //sb + ch
            
        }
        System.out.println(sb); 
            System.out.println(sb.length()); 
    }
    
}
//time complexity is O(26)