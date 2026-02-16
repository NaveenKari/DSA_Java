class Solution {
    public String countAndSay(int n) {
        String temp = "1";

        if(n == 1) return temp;

        for(int i = 2 ; i<=n ;i++){
            temp = getSay(temp);
            
        }

        return temp;

    }
    public String getSay(String res){
        StringBuilder res2 = new StringBuilder();
        int count = 1;

        if(res.length()==1){
            res2.append(String.valueOf(count));
            res2.append(res);
            return res2.toString();
        }

        for(int i = 0 ; i<res.length()-1; i++){
            if(res.charAt(i)==res.charAt(i+1)){
                count++;
            }else{
                res2.append(String.valueOf(count));
                res2.append(res.charAt(i));
                count = 1;
            }

        }
        res2.append(String.valueOf(count));
        res2.append(res.charAt(res.length()-1));


        return res2.toString();
    }
}