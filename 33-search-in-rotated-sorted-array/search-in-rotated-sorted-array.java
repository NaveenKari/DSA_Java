class Solution {
    public int search(int[] nums, int target) {
        int l = 0;
        int r = nums.length -1;

        while(l<=r){
            int mid = l + (r-l)/2;

            if(nums[mid] == target){
                return mid;
            }

            //left portion
            if(nums[mid]>= nums[0]){
                if(nums[mid]<target || target < nums[l]){
                    l = mid +1;
                }else{
                    r = mid -1;
                }

            }else{
                //right portion
                if(nums[mid]> target || target > nums[r]){
                    r = mid - 1;
                }else {
                    l = mid +1;
                }

            }
        }
        return -1;
    }
}