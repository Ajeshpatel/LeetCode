// Given a string s consisting of words and spaces, return the length of the last word in the string.

// A word is a maximal consisting of non-space characters only.

// Example 1:
// Input: s = "Hello World"
// Output: 5
// Explanation: The last word is "World" with length 5.

// Example 2:
// Input: s = "   fly me   to   the moon  "
// Output: 4
// Explanation: The last word is "moon" with length 4.

// Example 3:
// Input: s = "luffy is still joyboy"
// Output: 6
// Explanation: The last word is "joyboy" with length 6.

import java.util.Scanner;

public class LengthOfLastWord {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter String: ");
        String s = sc.nextLine();
        
        System.out.println(lengthOfLastWord(s));

        sc.close();
    }

    public static int lengthOfLastWord(String s) {

        String arr[] = s.split(" ");

        char arr2[] = arr[arr.length - 1].toCharArray();

        return arr2.length;
    }
}
