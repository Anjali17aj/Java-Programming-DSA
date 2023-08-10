//Ques) Remove duplicates in a string.
//Google , Microsoft.

public class RemoveDuplicates {
    public static void RemoveDuplicateString(String str, int idx, StringBuilder newStr, boolean map[]){ //StringBuilder a data type same as string but with faster execution 
    if(idx == str.length()){
        System.out.println(newStr);
        return;
    }
    //work
    char currChar = str.charAt(idx);
    if(map[currChar - 'a'] == true){ //if value true thn current char is a duplicate
     RemoveDuplicateString(str, idx+1, newStr, map);
    } else {
        map[currChar - 'a'] = true;
        RemoveDuplicateString(str, idx+1, newStr.append(currChar), map);
    }
    }
    public static void main(String args[]){
    String str = "appyfizinthebag";
    RemoveDuplicateString(str, 0 , new StringBuilder(""), new boolean[26]);
    }
}
