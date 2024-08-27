import java.util.*;
public class MaxAreaHistogram{
    public static void maxArea(int arr[]){ //o(n)
       int maxArea = 0;
       int nsr[] = new int[arr.length];
       int nsl[] = new int[arr.length];

       //Next Smaller right//o(n)
        Stack<Integer> s = new Stack<>();

        for(int i=arr.length-1; i>=0; i--){
            while(!s.isEmpty() && arr[s.peek()] >= arr[i]){
                s.pop();
            }
            if(s.isEmpty()) {
                nsr[i] = arr.length;
            }else{
                nsr[i] = s.peek();
            }
            s.push(i);
        }
       //Next smaller left//o(n)
        s = new Stack<>();

        for(int i=0; i<arr.length; i++){
            while(!s.isEmpty() && arr[s.peek()] >= arr[i]){
                s.pop();
            }
            if(s.isEmpty()) {
                nsl[i] = arr.length;
            }else{
                nsl[i] = s.peek();
            }
            s.push(i);
        }

       // current area : width j-i-1 = nsr[i]-nsl[i]-1 //o(n)
       for(int i=0; i<arr.length; i++){
          int height = arr[i];
          int width = nsr[i]- nsl[i] -1;
          int currArea = height * width;
          maxArea = Math.max(currArea, maxArea);
       }
       System.out.println("max area in histogram ="+ maxArea);
       
    }
    public static void main(String[] args){
    int arr[] = {2, 1, 5, 6, 2, 3} ; // heights in histohgram
        maxArea(arr);
    }
}