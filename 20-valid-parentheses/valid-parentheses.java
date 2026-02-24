class Solution {
    public boolean isValid(String s) {

        Map<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put('}', '{');
        map.put(']', '[');

        Deque<Character> stack = new ArrayDeque<>();

        for(char c : s.toCharArray()){

            // if closing bracket
            if(map.containsKey(c)){

                if(stack.isEmpty()) return false;

                char top = stack.pop();

                if(top != map.get(c)){
                    return false;
                }

            } else {
                // opening bracket
                stack.push(c);
            }
        }

        return stack.isEmpty();
    }
}