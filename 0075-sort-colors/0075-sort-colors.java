class Solution {
    public void sortColors(int[] nums) {
        for(int i =0; i< nums.length -1; i++){
            for(int j = 0; j<nums.length -i -1; j++){
                if(nums[j]>nums[j+1]){
                    //swap
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
        
    }
     public static void main(String[] args){
            int nums[] = {2,0,2,1,1,0};
            Solution obj = new Solution();
            obj.sortColors(nums);
            for(int i =0; i<nums.length; i++){
                System.out.println(nums[i]);
            }
        }
}