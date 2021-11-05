package Java_pepcoding;

import java.util.Scanner;

public class Sum_Of_Two_Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int[] a = new int[n1];
        for(int i=0 ; i<n1 ; i++)
            a[i] = sc.nextInt();

        int n2 = sc.nextInt();
        int[] b = new int[n2];
        for(int i=0 ; i<n2 ; i++)
            b[i] = sc.nextInt();

        int[] c = new int[Math.max(n1, n2)];
        int i = a.length-1;
        int j = b.length-1;
        int k = c.length-1;
        int carry = 0;

        while (k >= 0){

            int d = carry;
            if(i >= 0)
                d += a[i];
            if(j >= 0)
                d += b[j];

            carry = d / 10;
            d = d % 10;

            c[k] = d;

            i--;
            j--;
            k--;
        }
        if(carry != 0){
            System.out.println(carry);
        }
        for(int m : c)
            System.out.println(m);
    }
}
