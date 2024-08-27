import java.util.*;

public class reverseanarray {
    public static void reverseArray(int numbers[]){
          int reversearr[]= new int[numbers.length];
          for(int i=0; i<numbers.length; i++){
            reversearr[i] = numbers[numbers.length-i-1];
        }
        //print reversed array
        System.out.print("Reversed Arrayy :");
        for (int i : reversearr){
            System.out.print(i + " ");
        }
    }
    public static void main(String[] args) {
        int numbers[] = {1, 2, 3, 4, 5};
        reverseArray(numbers);
    }
}
