import java.util.*;
public class minmaxarray{
    public static int minmaxa(int numbers[]){
        int maxi = Integer.MIN_VALUE;
        int mini = Integer.MAX_VALUE;
        for(int i=0; i<numbers.length; i++){
            if(maxi < numbers[i]){
                maxi = numbers[i];

            }
            if(mini> numbers[i]){
                mini = numbers[i];
            }

        }
        System.out.println("min number:"+mini);
        return maxi;
    }
    public static void main(String args[]) {
        int numbers[] ={3,5,4,1,9};
    System.out.print("Largest number in the array is:"+ minmaxa(numbers));
    }
    
}
