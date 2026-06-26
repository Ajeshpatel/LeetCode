// Given an integer array nums, find the with the largest sum, and return its sum.

// Example 1:
// Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
// Output: 6
// Explanation: The subarray [4,-1,2,1] has the largest sum 6.

// Example 2:
// Input: nums = [1]
// Output: 1
// Explanation: The subarray [1] has the largest sum 1.

// Example 3:
// Input: nums = [5,4,-1,7,8]
// Output: 23
// Explanation: The subarray [5,4,-1,7,8] has the largest sum 23.

import java.util.Scanner;

public class MaximumSubArr {
    
    public static void main(String[] args) {
        
    
        Scanner sc = new Scanner(System.in);

        System.out.println("enter size of arr: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter Array Element: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Maximum SubArray: ");
        System.out.println(maxSubArray(arr));

        sc.close();
    }

    public static int maxSubArray(int[] nums) {

        int maximum = Integer.MIN_VALUE;
        int left = 0;
        int right = 0;
        for (int i = 0; i < nums.length; i++) {

            if (left < 0) left = 0;
            if (right < 0) right = 0;

            left = left + nums[i];
            right = right + nums[nums.length - i - 1];

            maximum = Math.max(maximum, Math.max(left, right));

        }

        return maximum;
    }
}
