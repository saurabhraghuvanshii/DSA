import java.util.*;
public class Recursion{
    // decreasing number
    public static void printDec(int n){
        if( n == 1){
            System.out.println(n);
            return;
        }
        System.out.print (n+" ");
        printDec(n-1);
    }
    //increasing order
    public static void printInc(int n){
        if(n == 1){
            System.out.print(n+" ");
            return;
        }
        printInc(n-1);
        System.out.print(n+" ");
    }

    // factorial of a number
    public static int fact(int n){
        if(n ==0){
            return 1;
        }
        //int fnm1 = fact(n-1);
        int fn = n* fact(n-1);
        return fn;

    }
    
    // sum of natural number
    public static int Sum(int n){
        if(n == 1){
            return 1;
        }
        int snm1 = Sum(n-1);
        int sn = n + snm1;
        return sn;

    }
    // check for array sorted
    public static boolean isSorted(int arr[] , int i){
        if(i == arr.length-1){ // base case 
            return true;
        }
        if(arr[i]> arr[i+1]){
            return false;
        }
        return isSorted(arr , i+1);
    }
    // first occurence of array
    public static int firstOccurence(int arr[], int key, int i){
        if(i == arr.length){
            return -1;
        }
        if(arr[i] == key){
            return i;
        }

        return firstOccurence(arr, key, i+1);
    } 
    // last occurence
    public static int lastOccurence(int arr[], int key, int i){
        if(i == arr.length){
            return -1;
        }
        int isFound = lastOccurence(arr, key, i+1);
        if(isFound  == -1 && arr[i]==key){
            return i;
        }

        return isFound;
    } 
    // print xpowern
    public static int xPowern(int x , int n){
        if(n==0){
           return 1;
        }

        // int xnm1 = xPowern(x,n-1);
        // int xn = x* xnm1;

        // return xn;
        return x * xPowern(x, n-1);

    }
    // print xpowern optimized
    public static int optimizedPower(int a , int n){ //O(logn)
        if( n == 0){
            return 1;
        }
        int halfPower = optimizedPower(a , n/2);
        int halfPowerSq = halfPower * halfPower;
        // n is odd
        if(n%2 !=0){
           halfPowerSq = a*  halfPowerSq;
        }
        return halfPowerSq;
    }
    //binary String without consecutive ones
    public static void printBinaryStrings(int n, int lastPlace, String str){
        // base case
        if( n == 0){
            System.out.println(str);
            return;
        }
        //kaam
        printBinaryStrings(n-1 , 0, str+"0");
        if(lastPlace == 0){
            printBinaryStrings(n-1, 1, str+"1");
        }

    }




    public static void main(String args[]){
       // int arr[] = {1,2,4,3,5,4};
    //    int a = 2;
    //    int n = 10;
    //     System.out.println(optimizedPower(a , n));
    printBinaryStrings(3,0, "");
    }
}
 