class Solution {
    public boolean isSubsequence(String s, String t) {
        int k = 0;
        int j = 0;
        for(int i =0; i< s.length() ; i++){
            System.out.println(j);
            while(j<t.length()){
                if(s.charAt(i) == t.charAt(j)){
                    k++;
                    j++;
                    break;
                }
                else{
                    j++;
                }
            }
        }

        return k == s.length() ? true:false;
    }
}