import java.util.HashMap;
import java.util.Map;

public class LongSubSumK{
    //map  this for negative value also
    public static int LongSumK(int arr[], int k){
        int n = arr.length; // size of the array.

        Map<Integer, Integer> preSumMap = new HashMap<>();
        int sum = 0;
        int maxLen = 0;
        for (int i = 0; i < n; i++) {
            //calculate the prefix sum till index i:
            sum += arr[i];

            // if the sum = k, update the maxLen:
            if (sum == k) {
                maxLen = Math.max(maxLen, i + 1);
            }

            // calculate the sum of remaining part i.e. x-k:
            int rem = sum - k;

            //Calculate the length and update maxLen:
            if (preSumMap.containsKey(rem)) {
                int len = i - preSumMap.get(rem);
                maxLen = Math.max(maxLen, len);
            }

            //Finally, update the map checking the conditions:
            if (!preSumMap.containsKey(sum)) {
                preSumMap.put(sum, i);
            }
        }

        return maxLen;
    }
    //pointer
    public static int getLongestSubarray(int []arr, long k) {
        int n = arr.length; // size of the array.

        int left = 0, right = 0; // 2 pointers
        long sum = arr[0];
        int maxLen = 0;
        while (right < n) {
            // if sum > k, reduce the subarray from left
            // until sum becomes less or equal to k:
            while (left <= right && sum > k) {
                sum -= arr[left];
                left++;
            }

            // if sum = k, update the maxLen i.e. answer:
            if (sum == k) {
                maxLen = Math.max(maxLen, right - left + 1);
            }

            // Move forward thw right pointer:
            right++;
            if (right < n) {
                sum += arr[right];
            }
        }

        return maxLen;
    }


    public static void main(String[] args) {
        int arr[] = {2,3,5};
        int k = 5;
        int len = LongSumK(arr, k);
        System.out.println(len);
        System.out.println(getLongestSubarray(arr, k));
    }
}