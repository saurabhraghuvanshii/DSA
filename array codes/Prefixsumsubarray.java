import java.util.*;
// brute force
public class Prefixsumsubarray{
    public static void maxSubarrays(int numbers[]){

        int currSum=0;
        int maxSum  = Integer.MIN_VALUE;
        int prefix[]= new int[numbers.length];
        prefix[0]  = numbers[0];

        //calculate prefix array
        for(int i=1; i<prefix.length-1; i++){
            prefix[i]= prefix[i-1] + numbers[i];
        }


        for(int i=0; i<numbers.length; i++){
            int start =i ;
            for(int j=1; j<numbers.length; j++){
                int end = j;
                currSum = start == 0 ? prefix[end] : prefix[end]- prefix[start-1];

              for(int k=start; k<=end; k++){ //print
               //subarrays sum
               currSum += numbers[k];
                
             } 
              
              if(maxSum < currSum){
                maxSum = currSum;
              }
              
              
            }
            
        }
        System.out.println("max sum ="+maxSum);
    }
    public static void main(String args[]){
       int numbers[]={2,3,4,5,6};
       maxSubarrays(numbers);
    }
}

