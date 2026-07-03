
/**
 * ArmsTrong
 */

import java.util.*;
public class ArmsTrong {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Num: ");
        int n = sc.nextInt();
        int original = n;

        double sum = 0;
        int digit = String.valueOf(n).length();

        while(n>0) {
            int rem = n %10;
            sum += Math.pow(rem, digit);
            n = n/10;
        }

        if(sum == original) {
            System.out.println("Armstrong Number");
        }
        else {
            System.out.println("Not Armstrong Number");
        }

        sc.close();
    } 
}