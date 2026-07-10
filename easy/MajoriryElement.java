// Given an array nums of size n, return the majority element.

// The majority element is the element that appears more than ⌊n / 2⌋ times.
//  You may assume that the majority element always exists in the array.

 

// Example 1:

// Input: nums = [3,2,3]
// Output: 3

// Example 2:

// Input: nums = [2,2,1,1,1,2,2]
// Output: 2

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

class MajoriryElement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of an array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter Array Ele");

        for (int i = 0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        
        System.out.println(majorityElement(arr));

        sc.close();
    }

    public static int majorityElement(int[] nums) {
        
        // int n = nums.length;

        // for (int i = 0; i<n; i++) {
        //     int majority = 0;

        //     for (int j = 0; j<n; j++) {
        //         if (nums[i] == nums[j]) {
        //             majority++;
        //         }
        //     }

        //     if (majority > n/2) {
        //         majority = nums[i];
        //         return majority;
        //     }
        // }

        // return -1;

        
        // int count = 0;
        // int candidate = 0;

        // for (int num: nums) {

        //     if(count == 0) {
        //         candidate = num;
        //     }

        //     if (num == candidate) {
        //         count++;
        //     }
        //     else {
        //         count--;
        //     }
        // }
        
        // return candidate;

        HashMap<Integer, Integer> hm = new HashMap<>();
        HashSet<Integer> hs = new HashSet<>();
        for(int x: nums) {
            hs.add(x);
            hm.put(x, hm.getOrDefault(x, 0) + 1);
        }

        int max = Integer.MIN_VALUE;
        int ans = -1;
        for(int num: hs) {
            if(hm.containsKey(num)) {
                if(hm.get(num) > max) {
                    max = hm.get(num);
                    ans = num;
                }
            }
        }

        return ans;
 
    }
    
}
