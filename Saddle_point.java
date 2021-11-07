package Java_pepcoding;
/*
1. You are given a square matrix of size 'n'. You are given n*n elements of the square matrix.
2. You are required to find the saddle price of the given matrix and print the saddle price.
3. The saddle price is defined as the least price in the row but the maximum price in the column of the matrix.
Input Format
A number n
e11
e12..
e21
e22..
.. n * n number of elements of array a
Output Format
Saddle point of the matrix if available or "Invalid input" if no saddle point is there.

Constraints
1 <= n <= 10^2
-10^9 <= e11, e12, .. n * m elements <= 10^9
Sample Input
4
11
12
13
14
21
22
23
24
31
32
33
34
41
42
43
44
Sample Output
41
*/
import java.util.Scanner;

public class Saddle_point {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = sc.nextInt();
        System.out.println("Enter the elements of the array:");
        int[][] a = new int[n][n];
        for(int i=0 ; i<n ; i++){
            for(int j=0 ; j<n ; j++){
                a[i][j] = sc.nextInt();
            }
        }

        // finding the index of column which has the smallest value
        for(int i=0 ; i<n ; i++){   // for rows
            int svj = 0;    // letting first index as smallest
            for(int j=1 ; j<n ; j++){
                if(a[i][j] < a[i][svj]){// svj - smallest value of j
                    svj = j;
                }
            }

            boolean flag = true;
            for(int k=0 ; k<n ; k++){
                if(a[k][svj] > a[i][svj]){
                    flag = false;
                    break;
                }
            }
            if(flag) {
                System.out.println(a[i][svj]);
                return;
            }
        }
        System.out.println("Invalid input");
    }
}























