class Solution {
    public int subarraySum(int[] nums, int k) {
        int res = 0;
        int prefixSum = 0;
        
        Map<Integer,Integer> hmap = new HashMap<>();
        hmap.put(0,1);

        for(int i = 0; i< nums.length;i++){
            prefixSum += nums[i];
            
            res += hmap.getOrDefault(prefixSum - k,0);

            hmap.put(prefixSum,hmap.getOrDefault(prefixSum,0)+1);
        }

        return res;

    }
}