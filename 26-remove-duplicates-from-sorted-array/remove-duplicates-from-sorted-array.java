class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 0) return 0;

        int i =0;
        for( int j = 1; j < nums.length; j++){
            if(nums[j]!= nums[i]){
                i = i+1;
                nums[i] = nums[j];
            }
        }
        return i+1;



        // int i = 0;
        // int j = i+1;
        // while(j<nums.length){
        //     if(nums[i]==nums[j]){
        //         j = j+1;
        //     }else if(nums[i]!= nums[j] && nums[i]<nums[j]){
        //         i = i+1;
        //         int temp = nums[i];
        //         nums[i] = nums[j];
        //         nums[j] = temp;
        //         j = j+1;           
        //     }else{
        //         j = j+1;
        //     }
        // }
        // return i + 1;
    }
}