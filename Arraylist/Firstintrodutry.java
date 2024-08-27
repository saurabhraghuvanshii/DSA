import java.util.ArrayList;
public class Firstintrodutry{
    
    public static void main (String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println(list.size());

        // get operation - o(1) time complexity  
        // int element =  list.get(1);
        // System.out.println(element);
        
        //delete
        // list.remove(2);
        // System.out.println(list);

        //Set
        // list.set(4,9);
        // System.out.println(list);
    }
}


