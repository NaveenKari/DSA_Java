class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        
        backtrack(res,n, 0,0,"");
        return res;
    }

    private void backtrack(List<String> res, int n, int open,int close,String temp){
        if(temp.length() == 2*n){
            res.add(temp);
            return;
        }
        
        if(open < n){
            backtrack(res,n,open+1,close,temp+"(");
        }

        if(close<open){
            backtrack(res,n,open,close+1,temp+")");
        }
       
    };

    
}