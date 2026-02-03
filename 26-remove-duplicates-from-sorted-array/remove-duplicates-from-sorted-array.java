class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 0;
        int j = i+1;
        while(j<nums.length){
            if(nums[i]==nums[j]){
                j = j+1;
            }else if(nums[i]!= nums[j] && nums[i]<nums[j]){
                i = i+1;
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j = j+1;           
            }else{
                j = j+1;
            }
        }
        return i + 1;
    }
}