class Solution {
    public void moveZeroes(int[] nums) {
        //My approach
        int i = 0;
        int j = 1;
        while(j<nums.length){
            if(nums[i] == 0 && nums[j]!=0){
               // System.out.println("entered");
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i+=1;
                j+=1;
            }
            else if(nums[i] == 0 && nums[j]==0){
                j+=1;
            }
            else{
                i+=1;
                j+=1;
            }
        }  
    }
}