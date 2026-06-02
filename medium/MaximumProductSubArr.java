// Given an integer array nums, find a that has the largest product, and return the product.

// The test cases are generated so that the answer will fit in a 32-bit integer.

// Note that the product of an array with a single element is the value of that element.

 

// Example 1:
// Input: nums = [2,3,-2,4]
// Output: 6
// Explanation: [2,3] has the largest product 6.

// Example 2:
// Input: nums = [-2,0,-1]
// Output: 0
// Explanation: The result cannot be 2, because [-2,-1] is not a subarray.

import java.util.Scanner;

public class MaximumProductSubArr {

    public static void main(String[] args) {
        
    
        Scanner sc = new Scanner(System.in);

        System.out.println("enter size of arr: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter Array Element: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Maximum Product SubArray: ");
        System.out.println(maxProduct(arr));

        sc.close();
    }

    public static int maxProduct(int[] nums) {
        // int n = nums.length;

        // int max_pro = nums[0];
        // for (int i = 0; i<=n-1; i++) {

        // int product = 1;
        // for (int j = i; j<=n-1; j++) {
        // product = product * nums[j];
        // max_pro = Math.max(max_pro, product);
        // }

        // }

        // return max_pro;

        int n = nums.length;

        int pro_max = Integer.MIN_VALUE;
        int pre = 1;
        int suff = 1;

        for (int i = 0; i < n; i++) {
            if (pre == 0)
                pre = 1;
            if (suff == 0)
                suff = 1;

            pre = pre * nums[i];
            suff = suff * nums[n - i - 1];

            pro_max = Math.max(pro_max, Math.max(pre, suff));
        }

        return pro_max;
    }
}
