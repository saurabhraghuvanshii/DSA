import java.util.*;
public class LinkedHashSetA{
    
    public static void main(String[] args) {
        HashSet<String> cities = new HashSet<>();
        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Noida");
        cities.add("Bengaluru");
        System.out.println(cities);

        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.add("Delhi");
        lhs.add("Mumbai");
        lhs.add("Noida");
        lhs.add("Bengaluru");
        System.out.println(lhs);


        TreeSet<String> ts = new TreeSet<>(); // asending order 
        ts.add("Delhi");
        ts.add("Mumbai");
        ts.add("Noida");
        ts.add("Bengaluru");
        System.out.println(ts);


    }
}