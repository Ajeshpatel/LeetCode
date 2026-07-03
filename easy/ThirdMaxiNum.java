// Given an integer array nums, return the third distinct maximum number in this array.
//  If the third maximum does not exist, return the maximum number.

 
// Example 1:
// Input: nums = [3,2,1]
// Output: 1
// Explanation:
// The first distinct maximum is 3.
// The second distinct maximum is 2.
// The third distinct maximum is 1.

// Example 2:
// Input: nums = [1,2]
// Output: 2
// Explanation:
// The first distinct maximum is 2.
// The second distinct maximum is 1.
// The third distinct maximum does not exist, so the maximum (2) is returned instead.

// Example 3:
// Input: nums = [2,2,3,1]
// Output: 1
// Explanation:
// The first distinct maximum is 3.
// The second distinct maximum is 2 (both 2's are counted together since they have the same value).
// The third distinct maximum is 1.

import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

/**
 * ThirdMaxiNum
 */
public class ThirdMaxiNum {

    public static void main(String[] args) {
        
    
        Scanner sc = new Scanner(System.in);

        System.out.println("enter size of arr: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter Array Element: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(thirdMax(arr));
        
        sc.close();
    }
    
    public static int thirdMax(int[] nums) {
        
        TreeSet<Integer> ts = new TreeSet<>();
        for (int i = 0; i<nums.length; i++) {
            ts.add(nums[i]);
        } 

       ArrayList<Integer> al = new ArrayList<>(ts);

       int size = al.size();

        if(size >= 3) {
            int idx = size - 3;

            return al.get(idx);
        }
        else{
            return al.get(size-1);
        }

    }
}