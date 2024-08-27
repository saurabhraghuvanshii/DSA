import java.util.*;
 public class twoSumA{
    public static int[] twosum(int nums[], int target) {
        for(int i=0 ; i<nums.length; i++){
            for(int j=i+1 ; j<nums.length; j++){
              if(  nums[i] + nums[j] == target){
                  return new int []{i,j};
                }
            }
        }
        return new int []{};
    }

    public static int[] twoSumII(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {
            int total = numbers[left] + numbers[right];

            if (total == target) {
                return new int[]{left + 1, right + 1};
            } else if (total > target) {
                right--;
            } else {
                left++;
            }
        }
        return new int[]{-1, -1}; // If no solution is found        
    }
    public static void main(String args[]){
        int nums[]={2,7,11,15};
        int target = 13;
        int sum[] = twosum(nums, target);
        System.out.println(sum[0]+" "+ sum[1]);
    }
   
}