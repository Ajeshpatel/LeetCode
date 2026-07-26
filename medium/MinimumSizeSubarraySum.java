// Given an array of positive integers nums and a positive integer target, return the minimal length of a whose sum is
//  greater than or equal to target. If there is no such subarray, return 0 instead.

 

// Example 1:

// Input: target = 7, nums = [2,3,1,2,4,3]
// Output: 2
// Explanation: The subarray [4,3] has the minimal length under the problem constraint.

// Example 2:

// Input: target = 4, nums = [1,4,4]
// Output: 1

// Example 3:

// Input: target = 11, nums = [1,1,1,1,1,1,1,1]
// Output: 0

import java.util.Scanner;

/**
 * MinimumSizeSubarraySum
 */
public class MinimumSizeSubarraySum {

    public static void main(String[] args) {
        
    
        Scanner sc = new Scanner(System.in);

        System.out.println("enter size of arr: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter Array Element: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter Target Num: ");
        int target = sc.nextInt();

        System.out.println(minSubArrayLen(target, arr));

        sc.close();
    }

    public static int minSubArrayLen(int target, int[] nums) {

        int i = 0;
        int j = 0;

        int res = Integer.MAX_VALUE;

        int sum = 0;
        while (i < nums.length || sum >= target) {

            if (sum >= target) {

                res = Math.min(res, i - j);

                sum = sum - nums[j];
                j++;
            } else {

                sum = sum + nums[i];
                i++;
            }
        }

        return res == Integer.MAX_VALUE ? 0 : res;

    }
}


