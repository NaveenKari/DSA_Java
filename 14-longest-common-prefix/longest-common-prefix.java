class Solution {
    public String longestCommonPrefix(String[] strs) {

        if(strs.length == 0) return "";
        
        String pref = strs[0];
        int pref_len = strs[0].length();

        for(int i = 1; i < strs.length ; i++){
            while(pref_len>strs[i].length() || !pref.equals( strs[i].substring(0,pref_len))){
                pref_len--;
                if(pref_len == 0){
                    return "";
                }
                pref = pref.substring(0,pref_len);
            }
        }
        return pref;


    }
}