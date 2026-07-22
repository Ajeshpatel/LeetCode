// Koko loves to eat bananas. There are n piles of bananas, the ith pile has piles[i] bananas. The guards have gone and will
//  come back in h hours.

// Koko can decide her bananas-per-hour eating speed of k. Each hour, she chooses some pile of bananas and eats k bananas from that pile.
//  If the pile has less than k bananas, she eats all of them instead and will not eat any more bananas during this hour.

// Koko likes to eat slowly but still wants to finish eating all the bananas before the guards return.

// Return the minimum integer k such that she can eat all the bananas within h hours.

 
// Example 1:
// Input: piles = [3,6,7,11], h = 8
// Output: 4

// Example 2:
// Input: piles = [30,11,23,4,20], h = 5
// Output: 30

// Example 3:
// Input: piles = [30,11,23,4,20], h = 6
// Output: 23

import java.util.Scanner;

public class KokoEatingBananas {
    public static void main(String[] args) {
        
    
        Scanner sc = new Scanner(System.in);

        System.out.println("enter size of arr: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter Array Element: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter h:");
        int h = sc.nextInt();
        
        System.out.println(minEatingSpeed(arr, h));

        sc.close();
    }

    public static int minEatingSpeed(int[] piles, int h) {

        int maximum = 0;
        int minimum = 1;
        for (int pile : piles) {
            maximum = Math.max(maximum, pile);
        }

        while (minimum <= maximum) {
            int mid = minimum + (maximum - minimum) / 2;
            if (canPossible(piles, h, mid)) {
                maximum = mid - 1;
            } else {
                minimum = mid + 1;
            }
        }

        return minimum;

    }

    public static boolean canPossible(int[] piles, int h, int mid) {
        long hour = 0;
        for (int pile : piles) {
            hour += (int) Math.ceil((double) pile / mid);
        }

        return hour <= h;
    }
}
