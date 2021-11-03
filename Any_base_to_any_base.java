package Java_pepcoding;

import java.util.Scanner;

public class Any_base_to_any_base {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter testcases");
        int t = scn.nextInt();

        while (t-- > 0) {
            System.out.println("Enter any number:");
            int n = scn.nextInt();
            System.out.println("Enter the base of the given number:");
            int sb = scn.nextInt();
            System.out.println("Enter the base in which you want the number to be converted:");
            int db = scn.nextInt();


            // first converting the number into the decimal number
            int c = 0;
            int ans = 0;
            while (n != 0) {

                ans += (n % 10) * (int) Math.pow(sb, c);
                n /= 10;
                c++;
            }

            // now we are converting it into the number with required base
            int res = 0;
            int p = 1;
            while (ans != 0) {

                int rem = ans % db;
                ans = ans / db;

                res = (rem * p) + res;
                p *= 10;
            }
            System.out.println(res);
            System.out.println();
        }
    }
}
