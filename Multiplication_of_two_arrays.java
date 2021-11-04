package Java_pepcoding;

import java.util.Arrays;
import java.util.Scanner;

public class Multiplication_of_two_arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows in array 1:");
        int n1 = sc.nextInt();
        System.out.println("Enter number of columns in array 1:");
        int m1 = sc.nextInt();
        System.out.println("Enter elements of array 1:");
        int[][] a1 = new int[n1][m1];
        for(int i=0 ; i<n1 ; i++)
            for(int j=0 ; j<m1 ; j++)
                a1[i][j] = sc.nextInt();

        System.out.println("Enter number of rows in array 2:");
        int n2 = sc.nextInt();
        System.out.println("Enter number of columns in array 2:");
        int m2 = sc.nextInt();
        System.out.println("Enter elements of array 2:");
        int[][] a2 = new int[n2][m2];
        for(int i=0 ; i<n2 ; i++)
            for(int j=0 ; j<m2 ; j++)
                a2[i][j] = sc.nextInt();


        if(m1 != n2) {
            System.out.println("Invalid input");
        }
        else{
            int[][] ans = new int[n1][m2];

            for(int i=0 ; i<ans.length ; i++){
                for(int j=0 ; j<ans[0].length ; j++){
                    ans[i][j] = 0;
                    for(int k=0 ; k<n2 ; k++){

                        ans[i][j] += a1[i][k] * a2[k][j];
                    }
                }
            }

            System.out.println("Multiplication of the arrays is :");
            for (int[] an : ans) {
                for (int i : an) {
                    System.out.print(i + "\t");
                }
                System.out.println();
            }
        }
    }
}
