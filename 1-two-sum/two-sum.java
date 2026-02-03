class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        Map<Integer,Integer> hmap = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            if(hmap.containsKey(target-nums[i])){
                return new int[] {hmap.get(target-nums[i]),i};
            }
            hmap.put(nums[i],i);
        }

        return new int[] {};


        // int[] res = new int[2];
        // for(int i =0; i<nums.length;i++){
        //     int s = target - nums[i];
        //     for(int j = i+1 ; j<nums.length; j++){
        //         if(nums[j]== s){
                    
        //             res[0] = i;
        //             res[1] = j;
        //             return res;
        //         }
        //     }
        // }
        // return res;
    }
}