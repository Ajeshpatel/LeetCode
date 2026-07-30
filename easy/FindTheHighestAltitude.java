// There is a biker going on a road trip. The road trip consists of n + 1 points at various altitudes.
//  The biker starts his trip on point 0 with altitude equal 0.

// You are given an integer array gain of length n where gain[i] is the net gain in altitude 
// between points i​​​​​​ and i + 1 for all (0 <= i < n). Return the highest altitude of a point.

 

// Example 1:
// Input: gain = [-5,1,5,0,-7]
// Output: 1
// Explanation: The altitudes are [0,-5,-4,1,1,-6]. The highest is 1.

// Example 2:
// Input: gain = [-4,-3,-2,-1,4,3,2]
// Output: 0
// Explanation: The altitudes are [0,-4,-7,-9,-10,-6,-3,-1]. The highest is 0.

import java.util.Scanner;

public class FindTheHighestAltitude {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of an array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter Array Ele");

        for (int i = 0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(largestAltitude(arr));
        sc.close();

    }

    public static int largestAltitude(int[] gain) {
        int latitudes = 0;
        int maxLatitude = 0;

        for (int i = 0; i < gain.length; i++) {
            latitudes += gain[i];

            maxLatitude = Math.max(maxLatitude, latitudes);
        }

        return maxLatitude;
    }
}
