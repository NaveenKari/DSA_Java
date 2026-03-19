class Solution {
    public int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int minNum = 5001;
    
        while(left <= right){
            //System.out.println(left);
            //System.out.println(right);

            int mid = left + (right - left)/2;

            minNum = Math.min(minNum,nums[mid]);
            //System.out.println(minNum);

            if(nums[mid] >= nums[right]){
                left = mid+1;
            }else if(nums[mid] < nums[right]){
                right = mid - 1;
            }
              
        }

        return minNum;
    }
}