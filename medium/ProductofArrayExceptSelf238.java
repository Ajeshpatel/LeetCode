// Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].

// The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.

// You must write an algorithm that runs in O(n) time and without using the division operation.

 

// Example 1:

// Input: nums = [1,2,3,4]
// Output: [24,12,8,6]

// Example 2:

// Input: nums = [-1,1,0,-3,3]
// Output: [0,0,9,0,0]

import java.util.Scanner;

public class ProductofArrayExceptSelf238 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter size of arr: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter Array Element: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        
        System.out.println(productExceptSelf(arr));

        sc.close();
    }

    public static int[] productExceptSelf(int[] nums) {

        int answer[] = new int[nums.length];
        int left[] = new int[nums.length];
        int right[] = new int[nums.length];

        int i = 1;
        int j = nums.length - 2;
        left[0] = 1;
        right[right.length - 1] = 1;
        int leftp = 1;
        int rightp = 1;

        while (i < nums.length && j >= 0) {
            leftp = nums[i - 1] * leftp;
            rightp = nums[j + 1] * rightp;

            left[i] = leftp;
            right[j] = rightp;

            i++;
            j--;
        }

        for (int k = 0; k < left.length; k++) {
            int num = left[k] * right[k];
            answer[k] = num;
        }

        return answer;
    }
}
