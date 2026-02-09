class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        Map<String,List<String>> hmap = new HashMap<>();

        for(String s : strs){
            char[] t = s.toCharArray();
            Arrays.sort(t);
            String sh = String.valueOf(t);

            if(!hmap.containsKey(sh)){
                hmap.put(sh,new ArrayList<String>());
            }

            hmap.get(sh).add(s);
            
        }

        for(List<String> s : hmap.values()){
            res.add(s);
        }

        return res;
    }
}