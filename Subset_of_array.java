package Java_pepcoding;

import java.util.Scanner;

public class Subset_of_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter elements:");
        for(int i=0 ; i<n ; i++)
            a[i] = sc.nextInt();


        for(int i=0 ; i<(int)Math.pow(2, a.length); i++){
            StringBuilder set = new StringBuilder();
            int temp = i;

            // because we have to find only 3 digits of the binary
            for(int j=a.length-1 ; j>=0 ; j--){
                int r = temp % 2;
                temp /= 2;

                if(r == 0)
                    set.insert(0, "-\t");
                else
                    set.insert(0, a[j] + "\t");
            }
            System.out.println(set);
        }
    }
}
