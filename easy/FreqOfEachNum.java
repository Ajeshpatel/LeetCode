


// 

/**
 * FreqOfEachNum
 */
import java.util.*;
public class FreqOfEachNum {

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

        System.out.println(map);

        for(Map.Entry<Integer, Integer> entry: map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        sc.close();
    }


}