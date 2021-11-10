package StriverSDE_Sheet;
/*
Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.

We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.

You must solve this problem without using the library's sort function.



Example 1:

Input: nums = [2,0,2,1,1,0]
Output: [0,0,1,1,2,2]
Example 2:

Input: nums = [2,0,1]
Output: [0,1,2]
Example 3:

Input: nums = [0]
Output: [0]
Example 4:

Input: nums = [1]
Output: [1]


Constraints:

n == nums.length
1 <= n <= 300
nums[i] is 0, 1, or 2.


Follow up: Could you come up with a one-pass algorithm using only constant extra space?
*/
import java.util.Arrays;
import java.util.Scanner;

public class Sort_Colors_leetcode {
    // TC = O(NlogN), SC = O(1)
    public static void bruteForce_TC_NlogN_SC_1(int[] a){
        Arrays.sort(a);

        System.out.println("bruteForce_TC_NlogN_SC_1");
        for(int i : a)
            System.out.print(i + " ");
        System.out.println();
    }
    // TC = O(N), SC= O(1)
    public static void bruteForce_TC_N(int[] a, int n){
        int countZero = 0, countOne = 0, countTwo = 0;
        for(int i=0 ; i<n ; i++){
            if(a[i] == 0)
                countZero++;
            else if(a[i] == 1)
                countOne++;
            else
                countTwo++;
        }

        int index = 0;
        while(countZero != 0){
            a[index] = 0;
            index++;
            countZero--;
        }
        while(countOne != 0){
            a[index] = 1;
            index++;
            countOne--;
        }
        while(countTwo != 0){
            a[index] = 2;
            index++;
            countTwo--;
        }

        System.out.println("bruteForce_TC_N");
        for(int i : a)
            System.out.print(i + " ");
        System.out.println();
    }
    // By using Butch National Algorithm
    // TC = O(N) , SC = O(1)
    public static void dutchNationalAlgo(int[] a, int n){
        int low = 0, mid = 0, high = n-1;

        // The motive is all the 0's(minimum value) will be shifted to the left of the low variable
        // and all the 2's(maximum value) will be shifted right to the high variable
        // this means middle value(means 1) will be shifted between the low and high variables.
        switch (a[mid]){
            // if the a[mid] == 2 then
            case 2:
                int temp = a[high];
                a[high] = a[mid];
                a[mid] = temp;
                high--;
                break;

            case 0:
                mid++;
                low++;
                break;

            case 1:
                int t = a[mid];
                a[mid] = a[low];
                a[low] = t;
                low++;
                break;
        }

        System.out.println("By Dutch National Algorithm");
        for(int i : a)
            System.out.print(i + " ");
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = sc.nextInt();
        System.out.println("Enter the elements of the array:");
        int[] a = new int[n];
        for(int i=0 ; i<n ; i++)
            a[i] = sc.nextInt();

        bruteForce_TC_NlogN_SC_1(a);
        bruteForce_TC_N(a, n);
        dutchNationalAlgo(a, n);
    }
}
