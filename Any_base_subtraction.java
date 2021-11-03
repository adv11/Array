package Java_pepcoding;

import java.util.Scanner;

public class Any_base_subtraction {
    public static int toDec(int n, int b){

        int ans = 0;
        int c = 0;
        while(n != 0){

            ans += (n % 10) * (int)Math.pow(b, c);
            c++;
            n /= 10;
        }
        return ans;
    }
    public static int getDifference(int b, int n1, int n2){
        // write your code here
        int ans = Math.abs(toDec(n1, b) - toDec(n2, b));

        int res = 0;
        int p = 1;
        while (ans != 0) {

            int rem = ans % b;
            ans = ans / b;

            res = (rem * p) + res;
            p *= 10;
        }

        return res;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter testcases:");
        int t = scn.nextInt();

        while (t-- > 0) {
            System.out.println("Enter the base:");
            int b = scn.nextInt();
            System.out.println("Enter the first number in base " + b);
            int n1 = scn.nextInt();
            System.out.println("Enter the second number in base " + b);
            int n2 = scn.nextInt();

            int d = getDifference(b, n1, n2);
            System.out.println("Subtraction of the numbers " + n1 + " and " + n2 + " in base " + b + " is : " + d);
        }
    }
}
