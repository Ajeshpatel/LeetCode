// Given two strings s and p, return an array of all the start indices of p's in s. You may return the answer in any order.

// Example 1:

// Input: s = "cbaebabacd", p = "abc"
// Output: [0,6]
// Explanation:
// The substring with start index = 0 is "cba", which is an anagram of "abc".
// The substring with start index = 6 is "bac", which is an anagram of "abc".

// Example 2:
// Input: s = "abab", p = "ab"
// Output: [0,1,2]
// Explanation:
// The substring with start index = 0 is "ab", which is an anagram of "ab".
// The substring with start index = 1 is "ba", which is an anagram of "ab".
// The substring with start index = 2 is "ab", which is an anagram of "ab".

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * FindAllAnagramInStr
 */

public class FindAllAnagramInStr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        String p = sc.next();

        System.out.println(findAnagrams(s, p));

        sc.close();

    }

    public static List<Integer> findAnagrams(String s, String p) {
        
        ArrayList<Integer> al = new ArrayList<>();
        int pCount[] = new int[26];
        int sCount[] = new int[26];

        if(s.length() < p.length()) {
            return al;
        }

        for (int i = 0; i<p.length(); i++){
            pCount[(p.charAt(i)) - 'a']++;
            sCount[(s.charAt(i)) - 'a']++;
        }

        if(Arrays.equals(pCount, sCount)) {
            al.add(0);
        }

        //Sliding window
        for(int i = p.length(); i<s.length(); i++) {
            sCount[(s.charAt(i)) - 'a']++;

            sCount[s.charAt(i-p.length()) - 'a']--;

            if(Arrays.equals(pCount, sCount)){
                al.add((i-p.length()) + 1);
            }
        }

        return al;
    }
    
}
