// Given a string s, reverse only all the vowels in the string and return it.

// The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.

 

// Example 1:
// Input: s = "IceCreAm"
// Output: "AceCreIm"

// Explanation:
// The vowels in s are ['I', 'e', 'e', 'A']. On reversing the vowels, s becomes "AceCreIm".

// Example 2:
// Input: s = "leetcode"
// Output: "leotcede"

import java.util.Scanner;

public class ReverseVowelsOfaString {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter String");
        String s = sc.next();

        System.out.println(reverseVowels(s));

        sc.close();
    }

    public static String reverseVowels(String s) {
        char nums[] = s.toCharArray();
        String vowel = "aeiouAEIOU";

        int i = 0;
        int j = nums.length - 1;

        while (i <= j) {
            if (vowel.indexOf(nums[i]) != -1 && vowel.indexOf(nums[j]) != -1) {
                char temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
                j--;
            } else if (vowel.indexOf(nums[i]) == -1) {
                i++;
            } else {
                j--;
            }
        }

        String ans = new String(nums);

        return ans;
    }
}
