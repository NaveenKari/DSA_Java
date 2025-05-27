class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long sum = 0;
        int k = 0;
        for(int i = 0; i< nums.length; i++){
            if(nums[i] == 0){
                k++;
                sum+=k;
            }
            else{
                k = 0;
            }
        }
        return sum;
    }
}