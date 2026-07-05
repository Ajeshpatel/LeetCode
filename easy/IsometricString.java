// Given two strings s and t, determine if they are isomorphic.

// Two strings s and t are isomorphic if the characters in s can be replaced to get t.

// All occurrences of a character must be replaced with another character while preserving the order
//  of characters. No two characters may map to the same character, but a character may map to itself.

// Example 1:
// Input: s = "egg", t = "add"
// Output: true
// Explanation:
// The strings s and t can be made identical by:
//     Mapping 'e' to 'a'.
//     Mapping 'g' to 'd'.

// Example 2:
// Input: s = "f11", t = "b23"
// Output: false
// Explanation:
// The strings s and t can not be made identical as '1' needs to be mapped to both '2' and '3'.

// Example 3:
// Input: s = "paper", t = "title"
// Output: true

import java.util.HashMap;
import java.util.Scanner;

public class IsometricString {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter 1st String: ");
        String s = sc.next();
        System.out.println("enter 1st String: ");
        String t = sc.next();

        System.out.println(isIsomorphic(s, t));

        sc.close();
    }

    public static boolean isIsomorphic(String s, String t) {
        
        if(s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Character> map1 = new HashMap<>();
        HashMap<Character, Character> map2 = new HashMap<>();

        for (int i = 0; i<s.length(); i++) {

            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);

            if(map1.containsKey(ch1)) {
                if(map1.get(ch1) != ch2) {
                    return false;
                }
            }
            else {
                map1.put(ch1, ch2);
            }

            if(map2.containsKey(ch2)) {
                if(map2.get(ch2) != ch1) {
                    return false;
                }
            }
            else {
                map2.put(ch2, ch1);
            }
        }

        return true;
    }
}
