class Solution {
    public int lengthOfLongestSubstring(String s) {
        int slen = s.length();

        if(slen == 0 || slen == 1) return slen;
        int res = 0;
        Map<Character,Integer> hmap = new HashMap<>();
        
        for(int i = 0;i<s.length();i++){
            int j = i;
            while(j<slen){
                if(hmap.containsKey(s.charAt(j))){
                    res = Math.max(res,hmap.size());
                    //System.out.println(hmap);
                    hmap.clear();
                    break;
                    
                }else{
                    hmap.put(s.charAt(j),j);
                    j++;
            }
            }   
        }
        return res;

        }
    
}