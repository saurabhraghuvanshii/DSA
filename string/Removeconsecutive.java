import java .util.*;
public class Removeconsecutive{
    public static String removeCons(String str){
       
        // if (str == null || str.length() == 0) {
        //     return "";
        // } // this line used for avoid nullpointerExceptions
        StringBuilder  result = new StringBuilder();
        result.append(str.charAt(0));
       
        for(int i = 1 ; i<str.length(); i++){
            if(str.charAt(i) != str.charAt(i-1)){
                result.append(str.charAt(i));  
            }
        }
        
        return result.toString();
        
    }
    public static void main(String args[]){
        String str = "aaaabbbbaa";
        System.out.println(removeCons(str));
        //removeCons( str);

    }
}