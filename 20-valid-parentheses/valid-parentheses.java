class Solution {
    public boolean isValid(String s) {

        if(s.length() == 1) return false;


        Deque<Character> stack = new ArrayDeque<>();

        for(char t : s.toCharArray()){
            if(t == '(' || t == '{' || t == '['){
                stack.push(t);
            }else if(t == ')'){
                if(stack.isEmpty()){
                    return false;
                }else if(stack.peek()== '('){
                    stack.pop();
                }else{
                    return false;
                }
                
            }else if(t == '}'){
                if(stack.isEmpty()){
                    return false;
                }else if(stack.peek()== '{'){
                    stack.pop();
                }else{
                    return false;
                }
            }else if(t == ']'){
                if(stack.isEmpty()){
                    return false;
                }else if(stack.peek()== '['){
                    stack.pop();
                }else{
                    return false;
                }
            }

        }

        return stack.isEmpty();
    }
}