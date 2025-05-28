class Solution {
    public String reverseWords(String s) {
        String res = "";
        String[] t = s.trim().split("\\s+");

        //System.out.println(Arrays.toString(t));

        for(int i = t.length - 1; i>0 ; i--){
            res = res + t[i]+" ";

        }

        return res+t[0];


    }
}