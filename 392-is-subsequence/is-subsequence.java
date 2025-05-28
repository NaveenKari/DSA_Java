class Solution {
    public boolean isSubsequence(String s, String t) {
        int left = 0;  // Pointer for the "subsequence" string 's'
        int right = 0; // Pointer for the "target" string 't'

        while (left < s.length() && right < t.length()) {
            if (s.charAt(left) == t.charAt(right)) { // Found a matching character! \U0001f389
                left++; // Move to the next character in 's'
            }
            right++; // Always move to the next character in 't' ➡️
        }

        return left == s.length(); // If we've reached the end of 's', it's a subsequence! ✅
    }
}