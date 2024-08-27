import java.util.*;
public class BasicHash{
    
    public static void frq(int arr[],int n){
        boolean visited[] = new boolean[n];

        for(int i = 0; i<n; i++){
            if(visited[i] == true){
                continue;
            }

            int count = 1;
            for(int j = i+1; j<n; j++){
              if(arr[i] == arr[j]){
                visited[j] = true;
                count++;
              }
            }
            System.out.println(arr[i] + " "+ count);
        }
    } 

    public static void HashFreq(int arr[], int n){
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<n; i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i]) + 1);
            }else{
                map.put(arr[i], 1);
            }
        }

        for(HashMap.Entry<Integer,Integer> entry :  map.entrySet()){
            System.out.println(entry.getKey() + " "+ entry.getValue());
        }
    }

    public static void HashFreqminmax(int arr[], int n){
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<n; i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i]) + 1);
            }else{
                map.put(arr[i], 1);
            }
        }

        int maxFreq = 0, minFreq = 0;
        int maxEle = 0, minEle = 0;

        for(HashMap.Entry<Integer,Integer> entry :  map.entrySet()){
            int count = entry.getValue();
            int element = entry.getKey();
            
            if(count > maxFreq){
                maxEle = element;
                maxFreq = count;
            }
            if(count < minFreq){
                minEle = element;
                minFreq = count;
            }
            
        }
        System.out.println("The highest frequency element is: " + maxEle);
        System.out.println("The lowest frequency element is: " + minEle);
    }

    public static void main(String args[]){
        int arr[] = {10,5,10,15,10,5};
        int n = arr.length;
        HashFreqminmax(arr, n);
        
    }
}