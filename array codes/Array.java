import java.util.*;
public class Array {
    /*public static void main (String args[]){
       int marks[] = new int[100] ;
       Scanner sc = new Scanner(System.in);
        marks[0]= sc.nextInt();
        marks[1]= sc. nextInt();
        marks[2]= sc. nextInt();
        System.out.println("phy:" +marks[0]);
        System.out.println("chem:" +marks[1]); 
        System.out.println("math:" +marks[2]);
        }*/
    


        public static int linearSearch(int numbers[],int key){
            for (int i=0; i<numbers.length; i++){
                if (numbers[i] == key){
                    return i;
                }
                
            }
            return -1;
            
        }
        public static void main(String args[]){
            int numbers[] ={2,4,3,5,6,7,4,8,23,35,31};
            int key = 8;
            int index = linearSearch(numbers, key);
            if(index == -1){
                System.out.print("Element is not present in array");

            }
            else{
            System.out.println("key is at index:" + index);
            }
        }

    /*  public static int GetLargest(int numbers[]){
        int largest = Integer.MIN_VALUE;
        int Smallest = Integer.MAX_VALUE;
        for (int i=0; i < numbers.length; i++ ){
            if(largest < numbers[i]){
                largest = numbers[i];
            }
            if (Smallest > numbers[i]){
                Smallest = numbers[i];
            }
        }
        System.out.println("smallest value is :"+ Smallest);
        return largest;
     }
     public static void main(String args[]) {
        int numbers[] = {23, 35, 31, 9};
        System.out.println("largest value is:"+ GetLargest(numbers));
     }*/

     
     
}
    

 