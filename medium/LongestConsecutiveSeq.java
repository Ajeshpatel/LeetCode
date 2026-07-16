
// Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.

// You must write an algorithm that runs in O(n) time.

// Example 1:
// Input: nums = [100,4,200,1,3,2]
// Output: 4
// Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4.

// Example 2:
// Input: nums = [0,3,7,2,5,8,4,6,0,1]
// Output: 9

// Example 3:
// Input: nums = [1,0,1,2]
// Output: 3

import java.util.*;

public class LongestConsecutiveSeq {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter size of arr: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter Array Element: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(longestConsecutive(arr));

        sc.close();
    }
    

    public static int longestConsecutive(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();

        for (int x : nums) {
            hs.add(x);
        }

        int longestLen = 0;
        for (int num : hs) {

            if (!hs.contains(num - 1)) {

                int currLen = 1;
                int nextNum = num + 1;

                while (hs.contains(nextNum)) {
                    currLen++;

                    nextNum++;
                }
                longestLen = Math.max(currLen, longestLen);
            }
        }

        return longestLen;
    }
}
