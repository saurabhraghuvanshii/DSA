import java.util.*;
public class raintrap{
     
    public static int findtotalwater(int arr[], int n){

        int lmax[]= new int[n];
        int max = 0;
        for(int i =0 ; i<n; i++){
            max = Math.max(max, arr[i]);
            lmax[i] = max;
        }
        int rmax[] = new int[n];
        max =0;
        for(int i=n-1; i>=0; i--){
            max = Math.max(max,arr[i]);
            rmax[i] = max;

        }
        // answer code
        int totalwater = 0;
        for(int i =0; i<n; i++){
            int lb = lmax[i]; // step1
            int rb = rmax[i]; // step2

            int min = Math.min(lb,rb); //step3
            int currwater = min - arr[i]; //step4
            totalwater = totalwater + currwater; // adding to the final answer
        }
        return  totalwater;

    }

    public static void main(String args[]){
        int arr[] = {0,1,0,2,1,0,1,3,2,1,2,1};
        int n = arr.length;
        System.out.println(findtotalwater(arr,n));

    }
}
