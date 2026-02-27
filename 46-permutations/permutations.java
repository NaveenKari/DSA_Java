class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        backtrack(res,new ArrayList<Integer>(),nums);
        return res;
    }

    private void backtrack(List<List<Integer>> res, List<Integer> tempset,int[] nums){
        if(tempset.size() == nums.length){
            res.add(new ArrayList<Integer>(tempset));
            return;
        }

        for(int i: nums){
            //if tempset already contains that option no need to consider it.
            if(tempset.contains(i)) continue;

            //add choice to temparray
            tempset.add(i);
            //explore all other options
            backtrack(res,tempset,nums);
            //backtrack
            tempset.remove(tempset.size()-1);
        }
    }
}