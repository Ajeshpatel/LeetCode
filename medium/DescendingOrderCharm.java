import java.util.Arrays;
import java.util.Scanner;

public class DescendingOrderCharm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter size of arr: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter Array Element: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Result: ");
        System.out.println(charm(arr));

        sc.close();

    }  
    
    public static int charm(int[] arr) {

        // int count = 0;
        // for (int i = 0; i<=arr.length-2; i++) {
        //     while(arr[i+1] > arr[i]) {
        //         arr[i+1] = arr[i+1] - 1;
        //         count+=1;
        //     }
        // }

        // return count;


        int count = 0;
        for (int i = 0; i <= arr.length - 2; i++) {
            if (arr[i + 1] > arr[i]) {
                count += arr[i+1] - arr[i];
                arr[i+1] = arr[i];
            }
        }

        return count;
    }
}
