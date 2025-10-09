// 3. Longest Substring Without Repeating Characters

// Given a string s, find the length of the longest
// without duplicate characters.

 

// Example 1:

// Input: s = "abcabcbb"
// Output: 3
// Explanation: The answer is "abc", with the length of 3. Note that "bca" and "cab" are also correct answers.

// Example 2:

// Input: s = "bbbbb"
// Output: 1
// Explanation: The answer is "b", with the length of 1.

// Example 3:

// Input: s = "pwwkew"
// Output: 3
// Explanation: The answer is "wke", with the length of 3.
// Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.


// ----------------------------------------------SOLUTION-----------------------------------------------------------------

public class LongestSubstrWithoutRepeatingChar {
    
    public static void main(String[] args) {
        // Write main section yourSelf(According to you);
    }


    public int lengthOfLongestSubstring(String s) {
        int n = s.length();

        int maxcount = 0;

        for (int i = 0; i < n; i++) {
            String substr = "";
            for (int j = i; j < n; j++) {
                char ch = s.charAt(j);

                if (substr.indexOf(ch) == -1) {
                    substr += ch;
                    maxcount = Math.max(maxcount, substr.length());
                } else {
                    break;
                }
            }

        }

        return maxcount;
    }
}
