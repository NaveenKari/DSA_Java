class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> output = new ArrayList<>();
        backtrack(output,nums,0,new ArrayList<Integer>());
        return output;
    }

    private void backtrack(List<List<Integer>> output, int[] nums, int index, List<Integer> tempset){
        // Inital step to add copy of tempset
        output.add(new ArrayList<Integer>(tempset));

        for(int i = index; i< nums.length;i++){
            //choose 
            tempset.add(nums[i]);
            //recurse (explore all the sols)
            backtrack(output,nums,i+1,tempset);
            //unchoose
            tempset.remove(tempset.size()-1);
        }
    }
}