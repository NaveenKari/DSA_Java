class Solution {
    public void moveZeroes(int[] nums) {

    int i = 0;

    for(int j = 0; j<nums.length;j++){
        if(nums[j]!=0){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j]= temp;
            i++;
        }
    }

    //     if(nums.length == 1 || nums.length == 0) return;

    //     int i = 0;
    //     int j = 1;

    //     while(j<nums.length){
    //         if(nums[i]== 0 && nums[j]!=0){
    //             int temp = nums[i];
    //             nums[i] = nums[j];
    //             nums[j] = temp;
    //             i = i+1;
    //             j= j+1;

    //         }else if(nums[i]!=0 && nums[j]!=0){
    //             i = i+1;
    //             j= j+1;
    //         }
    //         else if(nums[i]==0 && nums[j]==0){
    //             j = j+1;
    //         }else{
    //             i = i+1;
    //             j = j+1;
    //         }
    //     }
    }
}