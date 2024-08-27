import java.util.*;
public class pshBottom{ //o(n)
    public static void pushAtBottom(Stack<Integer> s,  int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtBottom(s, data);
        s.push(top);
    }
    //question 2
    public static String reverseString(String str){
        Stack <Character> s = new Stack<>();
        int idx = 0;
        while(idx < str.length()){
            s.push(str.charAt(idx));
            idx++;
        }

        StringBuilder result = new StringBuilder("");
        while(!s.isEmpty()){
            char curr = s.pop();
            result.append(curr);
        }
        return result.toString();
        
    }

    //Question3
    public static void reverseStack(Stack<Integer> s){
        if(s.isEmpty()){
            return ;
        }
        int top = s.pop();
        reverseStack(s);
        pushAtBottom(s, top);
    }

    public static void printStack(Stack<Integer> s){
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }
    //Question 4 stock span problem o(n)by stack 


    public static void main(String  args[]){
         Stack<Integer> s = new Stack<>();
         s.push(1);
         s.push(2);
         s.push(3);
        // pushAtBottom(s,4);
        // while(!s.isEmpty()){
        //     System.out.println(s.pop());
        // }
        //question 2
        // String str = "abcdefg";
        // String result = reverseString(str);
        // System.out.println(result);
        // question 3
        // reverseStack(s);
        // printStack(s);
    }
}