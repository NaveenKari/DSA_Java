class Solution {
    public int majorityElement(int[] nums) {
        int res = nums[0];
        int count = 0;
        int target = (nums.length)/2;
        for(int i = 0; i < nums.length; i++){
            if(res != nums[i]){
                res = nums[i];
            }
            for ( int j : nums){
               // System.out.println(res);
                if(j == res){
                    count+=1;
                }
            }
           // System.out.println(count);
            if(count > target){
                break;
            }
            count = 0;
        }
        return res;
    }
}