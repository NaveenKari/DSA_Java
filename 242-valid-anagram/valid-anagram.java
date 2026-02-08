class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;

        Map<Character,Integer> hmap = new HashMap<>();

        for(int i = 0; i < s.length();i++){
            char c = s.charAt(i);
            if(hmap.containsKey(c)){
                hmap.replace(c,hmap.get(c)+1);
            }else{
                hmap.put(c,1);
            }
        }
        //System.out.println(hmap);
        for(int i = 0; i < t.length();i++){
            char c = t.charAt(i);
            if(hmap.containsKey(c) && hmap.get(c)!= 0){
                hmap.replace(c,hmap.get(c)-1);
            }else{
                return false;
            }
        }
        //System.out.println(hmap);
        return true;
    }
}