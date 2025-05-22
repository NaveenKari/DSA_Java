class Solution {
    public int[] productExceptSelf(int[] nums) {
        //postfix and prefix approach

        int[] output = new int[nums.length];
        int pre = 1;
        int post = 1;
        for(int i = 0; i<nums.length;i++){
            if(i ==0){
                output[i] = pre;
            }
            else{
                pre = pre * nums[i-1];
                output[i] = pre;
            }
        }

        for(int i = nums.length-1; i >=0;i--){
            if(i == nums.length-1){
                output[i] = output[i] * post;
            }
            else{
                post = post*nums[i+1];
                output[i] = output[i] * post;
            }
        }

        return output;

    }
}