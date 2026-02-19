class Solution {
    public int[] dailyTemperatures(int[] temperatures) {

        int[] res = new int[temperatures.length];

        for(int i = 0; i < temperatures.length; i++){
            res[i]=0;
        }

        Deque<Integer> stack = new ArrayDeque<>();

        for(int i = 0 ; i< temperatures.length ; i++){
            

            while(!stack.isEmpty() && temperatures[stack.peek()]< temperatures[i]){
                int prevIndex  = stack.pop();
                res[prevIndex] = i - prevIndex;
                
            }

            stack.push(i);

        }

        return res;
        
    }
}