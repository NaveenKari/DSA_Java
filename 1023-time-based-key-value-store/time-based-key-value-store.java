class TimeMap {
    Map<String,List<Pair>> hmap;
    
    public TimeMap() {
        this.hmap = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        if(hmap.containsKey(key)){
            hmap.get(key).add(new Pair(value,timestamp));
        }else{
            ArrayList<Pair> pairList = new ArrayList<>();
            pairList.add(new Pair(value,timestamp));
            hmap.put(key,pairList);
        }
    }
    
    public String get(String key, int timestamp) {
        String res = "";
        List<Pair> pairlist = hmap.get(key);

        if(pairlist != null){
            int left = 0;
            int right = pairlist.size()-1;

            while(left <= right){
                int mid = left + (right - left)/2;
                int midVal = pairlist.get(mid).timestamp;
                System.out.println(midVal);
                if(midVal == timestamp){
                    res = pairlist.get(mid).val;
                    return res;
                }else if (midVal < timestamp){
                    res = pairlist.get(mid).val;
                    left = mid+1;
                }else{
                    right = mid-1;
                }
            }
        }
        return res;
    }
}

class Pair{
    String val;
    int timestamp;

    Pair(String val,int timestamp){
        this.val = val;
        this.timestamp = timestamp;
    }
}


