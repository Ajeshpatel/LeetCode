// Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.

 

// Example 1:

// Input: nums = [1,2,3,4,5,6,7], k = 3
// Output: [5,6,7,1,2,3,4]
// Explanation:
// rotate 1 steps to the right: [7,1,2,3,4,5,6]
// rotate 2 steps to the right: [6,7,1,2,3,4,5]
// rotate 3 steps to the right: [5,6,7,1,2,3,4]

// Example 2:

// Input: nums = [-1,-100,3,99], k = 2
// Output: [3,99,-1,-100]
// Explanation: 
// rotate 1 steps to the right: [99,-1,-100,3]
// rotate 2 steps to the right: [3,99,-1,-100]

import java.util.Arrays;
import java.util.Scanner;

public class RotateArray189 {
    public static void main(String[] args) {
        
    
        Scanner sc = new Scanner(System.in);

        System.out.println("enter size of arr: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter Array Element: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter K: ");
        int k = sc.nextInt();

        int[] result = rotate(arr, k);
        System.out.println(Arrays.toString(result));

        sc.close();
    }

    public static int[] rotate(int[] nums, int k) {

        k = k % nums.length;

        int i = 0;
        int j = nums.length - 1;
        while (i < j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;

            i++;
            j--;
        }

        int a = 0;
        int b = k - 1;
        while (a < b) {
            int temp = nums[a];
            nums[a] = nums[b];
            nums[b] = temp;

            a++;
            b--;
        }

        int c = k;
        int d = nums.length - 1;
        while (c < d) {
            int temp = nums[c];
            nums[c] = nums[d];
            nums[d] = temp;

            c++;
            d--;
        }

        return nums;
    }
}
