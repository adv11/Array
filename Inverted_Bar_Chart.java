package Java_pepcoding;

import java.util.Scanner;

public class Inverted_Bar_Chart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the array:");
        int n = sc.nextInt();
        System.out.println("Enter elements of the array:");
        int[] a = new int[n];
        int max = Integer.MIN_VALUE;
        for(int i=0 ; i<n ; i++) {
            a[i] = sc.nextInt();
            if(a[i] > max)
                max = a[i];
        }

        for(int i=0 ; i<max ; i++){     // for rows
            for(int j=0 ; j<n ; j++){   // for columns
                if(a[j] != 0){
                    System.out.print("*\t");
                    a[j]--;
                }else{
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
}
