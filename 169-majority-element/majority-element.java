class Solution {
    public int majorityElement(int[] nums) {
        //Optimized approach
        // element will repeat more than half of the array.
        int res = nums[0];
        int count = 1;

        for(int i = 1; i < nums.length; i++){
            if(count==0){
                res = nums[i];
                count++;
            }
            else if(nums[i]==res){
                count++;
            }
            else{
                count--;
            }
        }

        return res;




        // int res = nums[0];
        // int count = 0;
        // int target = (nums.length)/2;
        // for(int i = 0; i < nums.length; i++){
        //     if(res != nums[i]){
        //         res = nums[i];
        //     }
        //     for ( int j : nums){
        //        // System.out.println(res);
        //         if(j == res){
        //             count+=1;
        //         }
        //     }
        //    // System.out.println(count);
        //     if(count > target){
        //         break;
        //     }
        //     count = 0;
        // }
        // return res;
    }
}