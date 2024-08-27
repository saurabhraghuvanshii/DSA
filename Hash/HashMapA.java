import java.util.*;

public class HashMapA{
    public static void main(String[] args){
        //create
        HashMap<String, Integer> hm = new HashMap<>();

        //Insert -- O(1)
        hm.put("India" , 100);
        hm.put("China" , 200);

        System.out.println(hm);
 
        // //Get -- O(1)
        // int population = hm.get("India");
        // System.out.println(population);

        // System.out.println(hm.get("india"));

        // //cotainns key - o(1)  gives true or false
        // System.out.println(hm.containsKey("India")); //true

        //Remove
        // System.out.println(hm.remove("India"));
        // System.out.println(hm);

        //size
        System.out.println(hm.size());

        //IsEmpty
        hm.clear();
        System.out.println(hm.isEmpty());
    }
}