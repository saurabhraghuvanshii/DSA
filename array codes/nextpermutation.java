import java.util.*;
public class nextpermutation{
    public void nxtPermutation(int arr[]) {
        int n = arr.length;
        int ind = -1;
        // for finding the break point
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] < arr[i + 1]) {
                ind = i;
                break;
            }
        }
        // if the break point does not exist
        if (ind == -1) {
            reverse(arr, 0, n - 1);
            return;
        }
        for (int i = n - 1; i >= ind + 1; i--) {
            if (arr[i] > arr[ind]) {
                swap(arr, i, ind);
                break;
            }
        }
        // Reverse the entire right half array
        reverse(arr, ind + 1, n - 1);
        System.out.println();
    }

    // Function for reverse the array
    public void reverse(int arr[], int l, int r) {
        int start = l;
        int end = r;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        System.out.println();
    }

    // Function for swap the elements
    public void swap(int arr[], int i, int j) {
        int tem = arr[i];
        arr[i] = arr[j];
        arr[j] = tem;
        System.out.println();
    }



    public static void main(String args[]){
        int arr[] ={1,3,2};
        nextpermutation obj = new nextpermutation();
        obj.nxtPermutation(arr);
        System.out.println(Arrays.toString(arr));

        
    }



    
}