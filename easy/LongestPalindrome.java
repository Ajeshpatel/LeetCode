// Given a string s which consists of lowercase or uppercase letters, return the length of the longest  that can be built with those letters.

// Letters are case sensitive, for example, "Aa" is not considered a palindrome.


// Example 1:

// Input: s = "abccccdd"
// Output: 7
// Explanation: One longest palindrome that can be built is "dccaccd", whose length is 7.

// Example 2:

// Input: s = "a"
// Output: 1
// Explanation: The longest palindrome that can be built is "a", whose length is 1.

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class LongestPalindrome {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter String");
        String s = sc.next();

        System.out.println(longestPalindrome(s));

        sc.close();
    }

    public static int longestPalindrome(String s) {
        
        HashSet<Character> set = new HashSet<>();

        for (char ch : s.toCharArray()) {
            if (set.contains(ch)) {
                set.remove(ch);
            } else {
                set.add(ch);
            }
        }

        if (set.isEmpty()) {
            return s.length();
        }

        return s.length() - set.size() + 1;
    }

    // public int longestPalindrome(String s) {
        
    //     int len = 0;
    //     boolean odd = false;
    //     HashMap<Character, Integer> map = new HashMap();

    //     for (int i=0; i<s.length(); i++) {
    //         char ch = s.charAt(i);

    //         map.put(ch, map.getOrDefault(ch, 0) + 1);
    //     }


    //     for (int count: map.values()) {
            
    //         if(count %2 == 0) {
    //             len += count;
    //         }
    //         else {
    //             len += (count - 1);
    //             odd = true;
    //         }
    //     }

    //     if(odd == true) {
    //         len++;
    //     }

    //     return len;
    // }

    
    // public int longestPalindrome(String s) {

    //     int len = 0;
    //     boolean odd = false;
    //     HashMap<Character, Integer> map = new HashMap();

    //     for (int i = 0; i < s.length(); i++) {
    //         char ch = s.charAt(i);

    //         map.put(ch, map.getOrDefault(ch, 0) + 1);
    //     }

    //     StringBuilder sb = new StringBuilder();
    //     for (int i = 0; i < s.length(); i++) {
    //         char ch = s.charAt(i);

    //         if (sb.indexOf(String.valueOf(ch)) == -1) {
    //             sb.append(ch);
    //         }
    //     }
    //     String str = sb.toString();

    //     for (int i = 0; i < str.length(); i++) {
    //         char ch = str.charAt(i);

    //         if (map.get(ch) % 2 == 0) {
    //             len += map.get(ch);
    //         } else {
    //             len += (map.get(ch) - 1);
    //             odd = true;
    //         }
    //     }

    //     if (odd == true) {
    //         len++;
    //     }

    //     return len;
    // }
}
