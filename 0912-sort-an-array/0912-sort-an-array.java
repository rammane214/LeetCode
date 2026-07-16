 public class Solution {

     public int[] sortArray(int nums[]){
        for(int i = 0; i<nums.length;i++){
            int key = nums[i];
            int j = i-1;

            while(j>= 0 && nums[j]>key){
                nums[j+1] = nums[j];
                j--;
            }
            nums[j+1] = key;
        }
        return nums;
     }

    public static void main(String[] args) {

        int[] nums = {5, 2, 3, 1};

        Solution obj = new Solution();

        obj.sortArray(nums);

        System.out.println("Sorted Array:");

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}