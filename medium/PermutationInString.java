// Given two strings s1 and s2, return true if s2 contains a of s1, or false otherwise.

// In other words, return true if one of s1's permutations is the substring of s2.

 

// Example 1:
// Input: s1 = "ab", s2 = "eidbaooo"
// Output: true
// Explanation: s2 contains one permutation of s1 ("ba").

// Example 2:
// Input: s1 = "ab", s2 = "eidboaoo"
// Output: false

import java.util.Scanner;

public class PermutationInString {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First String(s1):");
        String s1 = sc.next();
        System.out.println("Enter First String(s2):");
        String s2 = sc.next();

        sc.close();
        
        System.out.println(checkInclusion(s1, s2));
    }

    public static boolean checkInclusion(String s1, String s2) {

        int n = s1.length();
        int m = s2.length();

        if (m < n)
            return false;

        int map1[] = new int[26];
        int map2[] = new int[26];

        for (int i = 0; i < n; i++) {
            map1[s1.charAt(i) - 'a']++;
            map2[s2.charAt(i) - 'a']++;
        }

        if (isMatches(map1, map2))
            return true;

        for (int i = 1; i <= m - n; i++) {
            map2[s2.charAt(i - 1) - 'a']--;
            map2[s2.charAt(i + n - 1) - 'a']++;

            if (isMatches(map1, map2))
                return true;
        }

        return false;
    }

    public static boolean isMatches(int nums1[], int[] nums2) {
        for (int i = 0; i < 26; i++) {
            if (nums1[i] != nums2[i])
                return false;
        }

        return true;
    }
}
