import java.util.*;
public class Stringcompression {
    public static String compress(String str){
        // stringbuilder use
        StringBuilder newStr = new StringBuilder();

        for(int i =0; i<str.length(); i++){
            Integer count  = 1;
            while(i<str.length()-1 && str.charAt(i)== str.charAt(i+1)){
              count++;
              i++;
            }
            //Append the character and its count to StringBuilder
            newStr.append(str.charAt(i));
            if(count > 1){
                newStr.append(count.toString());
            }
        }
        return newStr.toString();
        // String newStr = "";
        // //aaabc
        // for(int i=0; i<str. length(); i++) {
        //    Integer count = 1;
        //     while(i<str.length()-1 && str.charAt(i) == str.charAt(i+1)) {
        //       count++;
        //       i++;
        //     } 

        //     newStr += str.charAt(i);
        //     if(count > 1) {
        //          newStr += count. toString();
        //     }

        // }

       //return newStr;
    }
    public static void main(String args[]){
        String str = "aaabbbccdd";
        System.out.println(compress(str));

    }
    
}
