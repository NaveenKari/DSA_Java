class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];

        Deque<Integer> stack = new ArrayDeque<Integer>();

        for(int i = 2*n - 1; i>= 0; i--){
            while(!stack.isEmpty() && stack.peek() <= nums[i%n]){
                stack.pop();
            }

            if(stack.isEmpty()){
                res[i%n] = -1;
            }else{
                if(i<n) res[i] = stack.peek();
            }

            stack.push(nums[i%n]);
            
        }

        return res;
    }
}