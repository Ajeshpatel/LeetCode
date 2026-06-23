// Given an integer array nums and an integer k, return true if there are two distinct indices i and j in the array such that
//  nums[i] == nums[j] and abs(i - j) <= k.

 

// Example 1:]
// Input: nums = [1,2,3,1], k = 3
// Output: true

// Example 2:
// Input: nums = [1,0,1,1], k = 1
// Output: true

// Example 3:
// Input: nums = [1,2,3,1,2,3], k = 2
// Output: false

import java.util.HashMap;
import java.util.Scanner;

public class ContainDuplicateII {
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

        System.out.println(containsNearbyDuplicate(arr, k));

        sc.close();
    }

    public static boolean containsNearbyDuplicate(int[] nums, int k) {

        HashMap<Integer, Integer> hm = new  HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if(hm.containsKey(nums[i])) {
                int prevIdx = hm.get(nums[i]);

                if((i - prevIdx) <= k) {
                    return true;
                }
            }
            hm.put(nums[i], i);
        }

        return false;
    }
}
