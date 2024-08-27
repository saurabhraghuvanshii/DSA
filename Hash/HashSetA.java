import java.util.*;
public class HashSetA{
     
    public static  void main(String args[]){
        HashSet<Integer> set = new HashSet<>();

        set.add(1);
        set.add(2);
        set.add(4);
        set.add(2);
        set.add(1);
        
        System.out.println(set);

        // if(set.contains(2)){
        //     System.out.println("2 is present in the set");
        // }
      // System.out.println(set.size());
    }
}