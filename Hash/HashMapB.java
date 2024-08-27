import java.util.*;
public class HashMapB{
    public static void main(String args[]) {
        HashMap<String, Integer> hm = new HashMap<>();

        hm.put("India",100);
        hm.put("China",50);
        hm.put("Germany",80);
        hm.put("US",90);
        hm.put("Nepal",66);

        //Iterate

        //hm.entrySet()
        Set<String> keys = hm.keySet();
        System.out.println(keys);

        for (String k : keys) {
            
            System.out.println("key="+k+",value="+hm.get(k));
        }
            
        
    }
}
