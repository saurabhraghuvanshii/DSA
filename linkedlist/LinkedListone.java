import java.util.LinkedList;

public class LinkedListone{
    public static void main(String[] args){
        // Create a linked list object use claasses
        LinkedList<Integer> ll = new LinkedList<>();

        //add
        ll.addLast(1);
        ll.addLast(2);
        ll.addFirst(0);
        // 0>1>2
        System.out.println(ll);
    }
}