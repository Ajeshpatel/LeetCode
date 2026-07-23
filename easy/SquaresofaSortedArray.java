// Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.

// Example 1:

// Input: nums = [-4,-1,0,3,10]
// Output: [0,1,9,16,100]
// Explanation: After squaring, the array becomes [16,1,0,9,100].
// After sorting, it becomes [0,1,9,16,100].

// Example 2:

// Input: nums = [-7,-3,2,3,11]
// Output: [4,9,9,49,121]

import java.util.Scanner;

public class SquaresofaSortedArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of an array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter Array Ele");

        for (int i = 0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        
        System.out.println(sortedSquares(arr));

        sc.close();
    }

    public static int[] sortedSquares(int[] nums) {

        int left = 0;
        int right = nums.length - 1;
        int index = nums.length - 1;

        int ans[] = new int[nums.length];

        while (left <= right) {
            int leftsq = nums[left] * nums[left];
            int rightsq = nums[right] * nums[right];

            if (leftsq > rightsq) {
                ans[index] = leftsq;
                left++;
            } else {
                ans[index] = rightsq;
                right--;
            }
            index--;

        }
        return ans;
    }
}
