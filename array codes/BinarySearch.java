import java.util.*;
public class BinarySearch{

    public static int linearSearch(int arr[], int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                return i;
            }
        }

        return -1;
    }

    public static void BinarySearchA(int arr[], int tar){
        int n = arr.length;
        int start = 0;
        int end = n-1;
        while(start <= end){
            int mid = (start + end)/2;
            if(arr[mid] == tar){
                System.out.println("Element found at index " + mid);
                break;
            }else if(arr[mid] < tar){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = { 3, 5, 7 , 8, 9 ,11 , 13};
        BinarySearchA(arr, 11);

        int index = linearSearch(arr, 1);
        System.out.println("Element found at index " + index);
    
        
    }
}

