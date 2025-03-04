import java .util.*;

public class Allsorts{
    public static void bubbleSort(int arr[]){
         for(int turn=0; turn<arr.length-1; turn++){
             for(int j=0 ; j<arr.length-1-turn; j++){
               if(arr[j]>arr[j+1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
                

            }
        }
    }

    public static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");

        }
        System.out.println();

    }
    public static void selectionSort(int arr[]){
         for(int i=0; i<arr.length-1; i++){
            int minPos = i;
            for(int j=i+1; j<arr.length-1; j++){
                if(arr[minPos]> arr[j]){
                    minPos = j;
                }
            }
            //swap
            int temp = arr[minPos];
            arr[minPos] =arr[i];
            arr[i] = temp;

        }

    }
    public static void selectionSortDescending(int arr[]){
        for(int turn=0; turn<arr.length; turn++){
            int min = turn;
            //find the minimum element in remaining unsorted array
            for(int j=turn+1; j<arr.length; j++){
              if(arr[min] < arr[j]){
                min = j;
              }
            }
            int temp = arr[turn];
            arr[turn]=arr[min];
            arr[min]=temp;
        }

          
    }
    public static void insertionSort(int arr[]){
        for(int i=0 ; i<arr.length; i++){
            int curr =arr[i];
            int prev =i-1;

            //finddingg out the correct pos to inseert
            while(prev>=0 && arr[prev]>curr){
                  arr[prev+1]= arr[prev];
                  prev--;
            }
            //insertion
            arr[prev+1]= curr;

        }

    }
    public static void insertionSortDescending(int arr[]){
        for(int i=1; i<arr.length; i++){
           int curr = arr[i];
           int prev = i-1;
           while(prev >=0 && arr[prev]<curr){
            arr[prev + 1] = arr[prev];
            prev--;
           }
           arr[prev+1] = curr;
        }
    } 

    public static void countingSort(int arr[]){
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<arr.length;i++){

            largest = Math.max(largest, arr[i]);
        }

        int count[] = new int[largest+1];
        for(int i=0; i<arr.length; i++){
            count[arr[i]]++;
        }
        //sorting
        int j=0;
        for(int i=0; i<count.length; i++){
            while(count[i]>0){
                arr[j]=i;
                j++;
                count[i]--;
            }
        }
    }

    public static void countingSortDescending(int arr[]){
        int largest = Integer.MIN_VALUE;
        for(int i=0;  i<arr.length; i++){
            largest = Math .max(largest, arr[i]);

        }
        int count[] = new int[largest+1];
        for(int i=0; i<arr.length; i++){
            count[arr[i]]++;
        }
        int j = 0;
        for(int i =count.length-1; i>=0; i--){
            while(count[i] > 0){
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }

    public static void main(String args[]){
        int arr[] = {2,1,4,3,5};
       //selectionSort(arr);
      // selectionSortDescending(arr);
      //  printArr(arr);
      //  insertionSortDescending(arr);
      //  printArr(arr);
      countingSortDescending(arr);
      printArr(arr);


    }
}
