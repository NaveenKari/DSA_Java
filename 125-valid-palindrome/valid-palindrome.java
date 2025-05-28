class Solution {
    public boolean isPalindrome(String s) {
        String t = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        System.out.println(t);
        if (t.length() == 0) {
            return true;
        }

        int i = 0;
        int j = t.length() - 1;

        while (i < j) {
            if (t.charAt(i) == t.charAt(j)) {
                i++;
                j--;
            } else {
                return false;
            }
        }
        return true;

    }
}