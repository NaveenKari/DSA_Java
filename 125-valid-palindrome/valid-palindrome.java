class Solution {
    public boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length()-1;
        while(i<j){
            while(i<j && !Character.isLetterOrDigit(s.charAt(i))) i++;
            while(i<j && !Character.isLetterOrDigit(s.charAt(j))) j--;

            if(Character.toLowerCase(s.charAt(i)) == Character.toLowerCase(s.charAt(j))){
                i = i+1;
                j = j-1;
                continue;
            }
            return false;
        }
        return true;



        // StringBuilder test = new StringBuilder();
        // for(int i = 0; i<s.length();i++){
        //     if(Character.isLetterOrDigit(s.charAt(i))){
        //         test.append(Character.toLowerCase(s.charAt(i)));
        //     }

        //     continue;

        // }
        // int i =0;
        // int j = test.length()-1;
        // System.out.println(test);
        // while(i<j){
        //     if(test.charAt(i)==test.charAt(j)){
        //         i= i+1;
        //         j= j-1;
        //         continue;
        //     }else{
        //         return false;
        //     }
        // }
        // return true;

    }
}