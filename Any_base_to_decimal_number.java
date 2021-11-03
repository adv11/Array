package Java_pepcoding;

import java.util.Scanner;

public class Any_base_to_decimal_number {
    public static int any_base_to_decimal(int n, int base){

        int ans = 0;
        int p = 1;

        while(n > 0){

            int d = n % 10;
            n /= 10;

            ans += p * d;
            p *= base;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter test cases:");
        int t = sc.nextInt();

        while (t-- > 0) {
            System.out.println("Enter base:");
            int base = sc.nextInt();
            System.out.println("Enter number in base - " + base);
            int num = sc.nextInt();

            System.out.print("Before : " + num);
            System.out.println("\t\t\t\tAfter : " + any_base_to_decimal(num, base));
        }
    }
}
