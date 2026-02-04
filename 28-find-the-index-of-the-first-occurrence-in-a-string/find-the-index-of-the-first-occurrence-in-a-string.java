class Solution {
    public int strStr(String haystack, String needle) {

        int n = haystack.length();
        int m = needle.length();


        
        int i=0;

        while(i<= n-m){
            if(haystack.charAt(i)==needle.charAt(0)){
                int count = 0;
                while(count < m){
                    if(haystack.charAt(i+count)!=needle.charAt(count)){
                        break;
                    }
                    else{
                        count++;
                    }
                }
                if(count == m){
                    return i;
                }
            }
            i = i+1;
        }
        return -1;
    }
}