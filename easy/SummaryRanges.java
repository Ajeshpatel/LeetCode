// You are given a sorted unique integer array nums.

// A range [a,b] is the set of all integers from a to b (inclusive).

// Return the smallest sorted list of ranges that cover all the numbers in the array exactly. That is, each element of nums is covered by exactly one of the ranges, and there is no integer x such that x is in one of the ranges but not in nums.

// Each range [a,b] in the list should be output as:

//     "a->b" if a != b
//     "a" if a == b

 

// Example 1:
// Input: nums = [0,1,2,4,5,7]
// Output: ["0->2","4->5","7"]
// Explanation: The ranges are:
// [0,2] --> "0->2"
// [4,5] --> "4->5"
// [7,7] --> "7"

// Example 2:
// Input: nums = [0,2,3,4,6,8,9]
// Output: ["0","2->4","6","8->9"]
// Explanation: The ranges are:
// [0,0] --> "0"
// [2,4] --> "2->4"
// [6,6] --> "6"
// [8,9] --> "8->9"

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * SummaryRanges
 */
public class SummaryRanges {

    public static void main(String[] args) {
        
    
        Scanner sc = new Scanner(System.in);

        System.out.println("enter size of arr: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter Array Element: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(summaryRanges(arr));
        
        sc.close();
    }

    // public static List<String> summaryRanges(int[] nums) {
        
    //     List<String> ans = new ArrayList<>();

    //     if (nums.length == 0) {
    //         return ans;
    //     }

    //     int start = nums[0];

    //     for (int i = 1; i <= nums.length; i++) {

    //         if (i == nums.length || nums[i] != nums[i - 1] + 1) {

    //             if (start == nums[i - 1]) {
    //                 ans.add(String.valueOf(start));
    //             } else {
    //                 ans.add(start + "->" + nums[i - 1]);
    //             }

    //             if (i < nums.length) {
    //                 start = nums[i];
    //             }
    //         }
    //     }

    //     return ans;
    // }

    public static List<String> summaryRanges(int[] nums) {

        ArrayList<String> al = new ArrayList<>();

        for (int i = 0; i<nums.length; i++) {
            int startIdx = i;
            String start = String.valueOf(nums[i]);
            while(i< nums.length-1 && (nums[i]) + 1 == nums[i+1]) {
                i++;
            }

            if(startIdx == i) {
                al.add(start);
            }
            else{
                al.add(start + "->" + nums[i]);
            }


        }

        return al;
    }
    
}