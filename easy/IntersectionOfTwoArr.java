// Given two integer arrays nums1 and nums2, return an array of their . Each element in the result must be unique and
//  you may return the result in any order.

// Example 1:
// Input: nums1 = [1,2,2,1], nums2 = [2,2]
// Output: [2]

// Example 2:
// Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
// Output: [9,4]
// Explanation: [4,9] is also accepted.

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class IntersectionOfTwoArr {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter size of 1st arr: ");
        int n1 = sc.nextInt();
        int arr1[] = new int[n1];
        System.out.println("Enter Array Element: ");
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.println("enter size of 1st arr: ");
        int n2 = sc.nextInt();
        int arr2[] = new int[n2];
        System.out.println("Enter Array Element: ");
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = sc.nextInt();
        }

        System.out.println(intersection(arr1, arr2));

        sc.close();
    }

    public static int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> hs1 = new HashSet<>();

        for (int i = 0; i<nums1.length; i++) {
            hs1.add(nums1[i]);
        }

        ArrayList<Integer> al = new ArrayList<>();

        for(int x: nums2) {
            if(hs1.contains(x)) {
                al.add(x);
                hs1.remove(x);
            }
        }

       
        int[] ans = new int[al.size()];
        int i = 0;

        for (int x : al) {
            ans[i++] = x;
        }

        return ans;
    }

    // public static int[] intersection(int[] nums1, int[] nums2) {
    //     HashSet<Integer> hs1 = new HashSet<>();
    //     HashSet<Integer> hs2 = new HashSet<>();

    //     for (int i = 0; i < nums1.length; i++) {
    //         hs1.add(nums1[i]);
    //     }

    //     for (int i = 0; i < nums2.length; i++) {
    //         hs2.add(nums2[i]);
    //     }

    //     HashSet<Integer> hs3 = new HashSet<>(hs1);
    //     hs3.retainAll(hs2);

    //     int[] ans = new int[hs3.size()];
    //     int i = 0;

    //     for (int x : hs3) {
    //         ans[i++] = x;
    //     }

    //     return ans;

    // }
}
