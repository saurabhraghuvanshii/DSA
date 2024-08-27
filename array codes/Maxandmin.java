import java.util.*;
public class Maxandmin{
    public static int largestandsmaller(int numbers[]){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int i=0 ; i<numbers.length; i++){
            if (largest < numbers[i]){
                largest = numbers[i];
            }
            if (smallest > numbers[i]){
                smallest = numbers[i];
            }
        }
        System.out.println("smallest number:"+ smallest);
        return largest;
    }  
    public static void main(String args[]) {
         /*Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array:");
        int numbers = sc.nextInt();
        int[] arr = new int[numbers];
        System.out.println("Enter elements of array:");
        for(int i=0 ; i<arr.length; i++)
        arr[i] = sc.nextInt();
        int max = largestandsmaller(arr);
        System.out.println("\nLargest element in the given set is : "+max);
        }*/
    int numbers[] ={3,5,4,1,9};
       System.out.print("Largest number in the array is:"+ largestandsmaller(numbers));
    }

}
