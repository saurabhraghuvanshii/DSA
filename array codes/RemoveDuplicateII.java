public class RemoveDuplicateII{
    public static int removeDuplicates(int[] nums) {
        int j = 2;
        for(int i=2; i<nums.length; i++){
            if( nums[i] != nums[j-2]){
              nums[j] = nums[i];
              j++;
            }
        }
        return j;
    }

    
    public static  int removeDuplicatesA(int[] nums) {
        int j = 1;
        for(int i=1; i<nums.length; i++){
                if(nums[i] != nums[i-1]){
                    nums[j] = nums[i];
                    j++;
                }
        }
        return  j;
    }
    

    public static void printarr(int nums[]){
        for(int j=0; j<nums.length; j++){
            System.out.print(nums[j] + " ");

        }

    }
    public static void main(String[] args) {
        int nums[] = { 0, 1 ,1 ,1, 2, 2, 3};
        System.out.println(removeDuplicatesA(nums));
        printarr(nums);
        // System.out.println(removeDuplicatesA(nums));
        // printarr(nums);
    }
}