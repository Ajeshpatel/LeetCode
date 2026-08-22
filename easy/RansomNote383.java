// Given two strings ransomNote and magazine, return true if ransomNote can be constructed by using the letters from magazine and false otherwise.

// Each letter in magazine can only be used once in ransomNote.

// Example 1:
// Input: ransomNote = "a", magazine = "b"
// Output: false

// Example 2:
// Input: ransomNote = "aa", magazine = "ab"
// Output: false

// Example 3:
// Input: ransomNote = "aa", magazine = "aab"
// Output: true

import java.util.Scanner;

public class RansomNote383 {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter ransomeNote: ");
        String ransomNote = sc.next();

        System.out.println("enter magazine: ");
        String magazine = sc.next();


        System.out.println(canConstruct(ransomNote, magazine));

        sc.close();
    }
    
    public static boolean canConstruct(String ransomNote, String magazine) {

        int arr[] = new int[26];

        for (char ch : magazine.toCharArray()) {
            arr[ch - 'a']++;
        }

        for (char ch : ransomNote.toCharArray()) {
            if (arr[ch - 'a'] == 0) {
                return false;
            }
            arr[ch - 'a']--;
        }

        return true;
    }
}
