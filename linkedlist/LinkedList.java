public class LinkedList{
    public static class Node{
       int data;
       Node next;
       
       public Node(int data){
        this.data = data;
        this.next = null;
       }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data){

        //step1 = create new node
        Node newNode = new Node(data);
        size++;
        if( head == null){
            head = tail = newNode;
            return;
        }
        //step2 - newNode next = head
        newNode.next = head; // link

        //Step3 – head = newNode
        head = newNode;
    }
    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }
    public void print(){ //o(n) time complexity
        // if(head == null){ 
        //     System.out.println("LL is empty");
        //     return;
        // }
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println("null");

    }
    public void add(int idx, int data){
        // it is not neccesary line of line of code ot is for recursion
        if(idx == 0){
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;
        
        while(i< idx-1){
            temp = temp.next;
            i++;
        }

        // i = idx1; tem-> prev
        newNode.next = temp.next;
        temp.next = newNode;
    }
    public int removeFirst(){
        if(size == 0){
            System.out.println(" ll is empty");
            return Integer.MIN_VALUE;
        }else if(size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--; 
        return val;
    }
    public int removelast(){
        if(size == 0){
            System.out.println(" ll is empty");
            return Integer.MIN_VALUE;
        }else if(size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        // preev: i = size -2
        Node prev = head;
        for(int i=0; i<size-2; i++){
            prev = prev.next;
        }
        int val = tail.data; // = prev.next.data
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }
    public int itrSearch(int key){
        Node temp = head;
        int i = 0;
        while (temp != null) {
            if(temp.data == key){// key found
                return i;
            }
            temp = temp.next;
            i++;
        }
        //key noot found
        return -1;

    }
    public int helper(Node head , int key){ // it is actuall recursion function
        if(head == null){
            return -1;
        }

        if(head.data == key){
            return 0;
        }
        int idx = helper(head.next , key);
        if(idx == -1){
            return -1;
        }
        return idx+1;
    }
    public int recSearch(int key){
          return helper(head , key);
    }

    public void reverse(){
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while(curr!= null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    // imp question
    public void deleteNthfromEnd(int n ){
        //calculate size
        int sz = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            sz++;
        }
        if(n == sz){
            head = head.next;
            return;
        }

        //sz-n
        int i = 1;
        int iToFind = sz-n;
        Node prev = head;
        while( i< iToFind){
            prev=prev.next ;
            i++;
        }
        prev.next = prev.next.next;
        return;
    }
    public Node findMid(Node head){ // helper
        Node slow = head;
        Node fast = head;
        while (fast!=null && fast.next != null){
            slow = slow.next;//+1
        
            fast = fast.next.next;//+2
        }
        return slow; // slow is my midNode
    }
    public boolean isPalindrome() { //
        //base casse
        if(head == null || head.next == null){
            return true;
        }
        // step-1 - find mid 
        Node midNode = findMid(head);
        //step -2 reeverse 2nd half
        Node prev = null;
        Node curr = midNode;
        Node next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right = prev;//right hal head
        Node left = head;
        //step -3 compare both side
        while(right != null){
            if(left.data != right.data){
                return false;
            }
            left=left.next;
            right=right.next;
        }
        return true;
    }
    
    public static boolean isCycle(){
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next; //+1
            fast = fast.next.next;//+2
            if(slow == fast){
                return true; // cycle exits
            }
        }
        return false; // cycle does not exists
    }

    public static void removeCycle(){
        // detect cycle
        Node slow = head;
        Node fast = head;
        boolean cycle = false;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow){
                cycle = true;
                break;
            }
        }
        if(cycle == false){
            return;
        }
        // ffind the meeting point
        slow = head;
        Node prev = null;// last node
        while(slow != fast){
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }
        // remove cycle -> last.next = null
        prev.next = null;
    }

    private Node getMid(Node head){
        Node slow = head;
        Node fast = head.next;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;

    }

    private Node merge(Node head1, Node head2){
        Node mergedLL = new Node(-1);
        Node temp = mergedLL;
        while(head1 != null && head2 != null){
            if(head1.data <= head2.data){
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            }else{
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }
        while(head1 != null){
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }
        while(head2 != null) {
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;  
        }
        return  mergedLL.next;
    }

    public Node mergeSort(Node head){//o(nlogn)
        if(head == null || head.next == null){
            return head;
        }
        // find mid
        Node mid = getMid(head);
        //left & right ms
        Node rightHead = mid.next;
        mid.next = null;
        Node newLeft = mergeSort(head);
        Node newRight = mergeSort(rightHead);

        // merge
        return merge(newLeft , newRight);
    }

    public void zigZag(){
        //find mid
        Node slow = head;
        Node fast = head;
        while(fast.next != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        Node mid = slow.next;

        //reverse 2nd half
        Node curr = mid.next;
        mid.next = null;
        Node prev = null;
        Node next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node left = head;
        Node right = prev;
        Node nextL, nextR;

        //alt merge - zig zag merge
        while(left != null && right != null){
            nextL = left.next;
            left.next = right;
            nextR = right.next;
            right.next = nextL;

            left = nextL;
            right = nextR;
        }
    }
    
    public static void main(String args[]){
        // LinkedList l1 = new LinkedList();
        // l1.addLast(1);
        // l1.addLast(2);
        // l1.addLast(3);
        // l1.addLast(1);
        // l1.print();
        // System.out.println(l1.isPalindrome());
        // //System.out.println(l1.size);
       // System.out.println(l1.recSearch(9));
        //l1.reverse();
        //l1.print();
        //l1.deleteNthfromEnd(3);
        //l1.print();
        // head = new Node(1);
        // Node temp = new Node(2); 
        // head.next = temp;
        // head.next.next = new Node(3);
        // head.next.next.next = temp;
        // System.out.println(isCycle());
        // removeCycle();
        // System.out.println(isCycle());
        LinkedList ll = new LinkedList();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.print();
        // ll.head = ll.mergeSort(ll.head);
        // ll.print();
        // System.out.println();
        ll.zigZag();
        ll.print();
    }
}