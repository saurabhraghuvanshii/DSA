import java .util.*;
public class duplicatecontain {
    public static boolean duplicate(int num[]){
        Arrays.sort(num);
        for(int i=0; i<num.length-1;i++){
            if(num[i]== num[i+1]){
                return true;
            }
            
        }
        return false;
    }
    public static void main(String arg[]){
        int num[]= {1,2,3,4,6};
        System.out.println("dublicate num:"+duplicate(num));
    }
    
}
