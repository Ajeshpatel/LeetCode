// Given a pattern and a string s, find if s follows the same pattern.

// Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in s. Specifically:

//     Each letter in pattern maps to exactly one unique word in s.
//     Each unique word in s maps to exactly one letter in pattern.
//     No two letters map to the same word, and no two words map to the same letter.

 

// Example 1:
// Input: pattern = "abba", s = "dog cat cat dog"
// Output: true
// Explanation:
// The bijection can be established as:
//     'a' maps to "dog".
//     'b' maps to "cat".

// Example 2:
// Input: pattern = "abba", s = "dog cat cat fish"
// Output: false

// Example 3:
// Input: pattern = "aaaa", s = "dog cat cat dog"
// Output: false

import java.util.HashMap;
import java.util.Scanner;

/**
 * WordPattern
 */
public class WordPattern {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter 1st String: ");
        String pattern = sc.next();
        System.out.println("enter 2nd String: ");
        String s = sc.nextLine();

        System.out.println(wordPattern(pattern, s));

        sc.close();
    }

    public static boolean wordPattern(String pattern, String s) {
        
        HashMap<Character, String> map1 = new HashMap<>();
        HashMap<String, Character> map2 = new HashMap<>();

        char[] ch = pattern.toCharArray();
        String str[] = s.split(" ");

        if(ch.length != str.length) {
            return false;
        } 

        for (int i = 0; i<ch.length; i++) {
            char c1 = ch[i];
            String c2 = str[i];

            if(map1.containsKey(c1)) {
                if(!map1.get(c1).equals(c2)) {
                    return false;
                }
            }
            else {
                map1.put(c1, c2);
            }

            if(map2.containsKey(c2)) {
                if(!map2.get(c2).equals(c1)) {
                    return false;
                }
            }
            else {
                map2.put(c2, c1);
            }
        }

        return true;
    }
    
}
