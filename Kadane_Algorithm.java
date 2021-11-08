package StriverSDE_Sheet;

import java.util.Scanner;

public class Kadane_Algorithm {
    // T.C = O(n^3)
    public static int bruteForce(int[] a, int n){

        int maximumSubarraySum = 0;
        for(int i=0 ; i<n ; i++){
            for(int j=i ; j<n ; j++){
                int temp = 0;
                for(int k=i ; k<=j ; k++){
                    temp += a[k];
                }
                maximumSubarraySum = Math.max(maximumSubarraySum, temp);
            }
        }
        return maximumSubarraySum;
    }
    // T.C = O(n)
    public static int optimised(int[] a, int n){

        int currentSum=a[0], overallSum=a[0];
        for(int i=1 ; i<n ; i++){
            if(currentSum >= 0)
                currentSum += a[i];
            else
                currentSum = a[i];

            if(currentSum > overallSum)
                overallSum = currentSum;
        }
        return overallSum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements in the array:");
        int n = sc.nextInt();
        System.out.println("Enter the elements:");
        int[] a = new int[n];
        for(int i=0 ; i<n ; i++)
            a[i] = sc.nextInt();

        System.out.println(bruteForce(a, n));
        System.out.println(optimised(a, n));
    }
}
