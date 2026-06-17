// A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all
//  non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.

// Given a string s, return true if it is a palindrome, or false otherwise.

// Example 1:
// Input: s = "A man, a plan, a canal: Panama"
// Output: true
// Explanation: "amanaplanacanalpanama" is a palindrome.

// Example 2:
// Input: s = "race a car"
// Output: false
// Explanation: "raceacar" is not a palindrome.

// Example 3:
// Input: s = " "
// Output: true
// Explanation: s is an empty string "" after removing non-alphanumeric characters.
// Since an empty string reads the same forward and backward, it is a palindrome.



import java.util.Scanner;

public class ValidPalindrome2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        System.out.println(isPalindrome(s));

        sc.close();

    }

    public static boolean isPalindrome(String s) {
        s = s.toLowerCase();

        StringBuilder sb = new StringBuilder("");

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (Character.isLetterOrDigit(ch)) {
                sb.append(Character.toLowerCase(ch));
            }
        }

        StringBuilder rsb = new StringBuilder(sb);
        rsb.reverse();

        return sb.toString().equals(rsb.toString());
    }
}
