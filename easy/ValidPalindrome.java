// Given two strings s and t, return true if t is an of s, and false otherwise.

// Example 1:
// Input: s = "anagram", t = "nagaram"

// Output: true
// Example 2:

// Input: s = "rat", t = "car"
// Output: false

import java.util.Arrays;
import java.util.Scanner;

class ValidPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        String t = sc.next();
        System.out.println(isAnagram(s, t));

        sc.close();

    }

    public static boolean isAnagram(String s, String t) {
        // s = s.toLowerCase();
        // t = t.toLowerCase();

        char[] arr1 = s.toCharArray();
        char[] arr2 = t.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);
        String ns = String.valueOf(arr1);
        String nt = String.valueOf(arr2);

        return ns.equals(nt);
    }
}