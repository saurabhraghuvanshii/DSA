import java.util.*;
public class vaildParenthese{
    public static boolean isValid(String str){
        if (str == null || str.isEmpty()) {
            return true;
        }
      
      Stack<Character> stack = new Stack<Character>();
      for (char c: str.toCharArray()){
        if (c == '(')
           stack.push(')');
        else if (c == '{')
            stack.push('}');
        else if ( c == '[')
            stack.push(']');
        else if (stack.isEmpty() ||  stack.pop()!=c)
            return false;
     }
        return stack.isEmpty();
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        System.out.println(isValid(str));
        
    }
}