class Solution {
    public int minEatingSpeed(int[] nums, int h) {
        int upper = 0;
        int lower = 1;
        int total = 0;
        int fin = 0;
        for(int i = 0; i < nums.length;i++){
            upper = Math.max(upper,nums[i]);
            total+= nums[i];
        }

        while(upper >= lower){
            int mid = lower+ (upper-lower)/2;
            long res = check(nums,mid);

            if(res<=h){
                fin = mid;
                upper = mid -1;
            }else if(res > h){
                lower = mid+1;
            }

        }
        return fin;

    }
    private long check(int[] nums,int k){
        long hrs = 0;
        for(int i: nums){
            hrs += (i+k-1)/k;
        }
        return hrs;
    }
}