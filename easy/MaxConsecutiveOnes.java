// Given a binary array nums, return the maximum number of consecutive 1's in the array.

// Example 1:
// Input: nums = [1,1,0,1,1,1]
// Output: 3
// Explanation: The first two digits or the last three digits are consecutive 1s. The maximum number of consecutive 1s is 3.

// Example 2:
// Input: nums = [1,0,1,1,0,1]
// Output: 2

import java.util.Scanner;

/**
 * MaxConsecutiveOnes
 */
public class MaxConsecutiveOnes {
     public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of an array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter Array Ele");

        for (int i = 0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        
        System.out.println(findMaxConsecutiveOnes(arr));

        sc.close();
    }

    public static int findMaxConsecutiveOnes(int[] nums) {

        int max = 0;
        int count = 0;

        for (int num : nums) {
            if (num == 1) {
                count++;
                max = Math.max(max, count);
            } else {
                count = 0;
            }
        }

        return max;

    }
    
}