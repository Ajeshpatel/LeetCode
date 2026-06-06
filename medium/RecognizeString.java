// Given a string s, rearrange the characters of s so that any two adjacent characters are not the same.

// Return any possible rearrangement of s or return "" if not possible.

 

// Example 1:
// Input: s = "aab"
// Output: "aba"

// Example 2:
// Input: s = "aaab"
// Output: ""


import java.util.Scanner;

class RecognizeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String n = sc.next();

        System.out.println(reorganizeString(n));

        sc.close();

    }

    public static String reorganizeString(String s) {
        int hash[] = new int[26];

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int index = ch - 'a';
            hash[index] += 1;
        }

        int max = 0;
        int letter = 0;
        for (int i = 0; i < hash.length; i++) {
            if (hash[i] > max) {
                max = hash[i];
                letter = i;
            }
        }

        if (max > ((s.length() + 1) / 2)) {
            return "";
        }

        char res[] = new char[s.length()];

        int idx = 0;
        while (hash[letter] > 0) {
            res[idx] = (char) (letter + 'a');
            hash[letter]--;
            idx += 2;
        }

        for (int i = 0; i < hash.length; i++) {

            while (hash[i] > 0) {

                if (idx >= res.length) {
                    idx = 1;
                }

                char ch = (char) (i + 'a');
                res[idx] = ch;

                idx += 2;
                hash[i]--;

            }
        }

        return String.valueOf(res);
    }
    
}