import java.util.HashMap;
import java.util.Scanner;

/**
 * FirstNonRepeatingEle
 */
public class FirstNonRepeatingEle {

    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of an array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter Array Ele");

        for (int i = 0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        // if want sorted then use TreeMap

        for (int i = 0; i<arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        for(int x: arr) {
            if (map.get(x) == 1) {
                System.out.println("First non repearing element is: " + x);
                return;
            }
        }

        System.out.println("Not found");

        sc.close();
    }
}