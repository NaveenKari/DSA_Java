class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> lastIndex = new HashMap<>();
        int left = 0;
        int best = 0;

        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);

            if (lastIndex.containsKey(c)) {
                left = Math.max(left, lastIndex.get(c) + 1);
            }

            lastIndex.put(c, right);
            best = Math.max(best, right - left + 1);
        }

        return best;




        // int slen = s.length();

        // if(slen == 0 || slen == 1) return slen;
        // int res = 0;
        // Map<Character,Integer> hmap = new HashMap<>();
        
        // for(int i = 0;i<s.length();i++){
        //     int j = i;
        //     while(j<slen){
        //         if(hmap.containsKey(s.charAt(j))){
        //             res = Math.max(res,hmap.size());
        //             //System.out.println(hmap);
        //             hmap.clear();
        //             break;
                    
        //         }else{
        //             hmap.put(s.charAt(j),j);
        //             j++;
        //     }
        //     }   
        // }
        // return res;

        }
    
}