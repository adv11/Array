package Array_Problems;
/*
Given a 1-indexed array of integers numbers that is already sorted in non-decreasing order, find two numbers such that they add up to a specific target number. Let these two numbers be numbers[index1] and numbers[index2] where 1 <= index1 < index2 <= numbers.length.

Return the indices of the two numbers, index1 and index2, added by one as an integer array [index1, index2] of length 2.

The tests are generated such that there is exactly one solution. You may not use the same element twice.



Example 1:

Input: numbers = [2,7,11,15], target = 9
Output: [1,2]
Explanation: The sum of 2 and 7 is 9. Therefore, index1 = 1, index2 = 2. We return [1, 2].
Example 2:

Input: numbers = [2,3,4], target = 6
Output: [1,3]
Explanation: The sum of 2 and 4 is 6. Therefore index1 = 1, index2 = 3. We return [1, 3].
Example 3:

Input: numbers = [-1,0], target = -1
Output: [1,2]
Explanation: The sum of -1 and 0 is -1. Therefore index1 = 1, index2 = 2. We return [1, 2].


Constraints:

2 <= numbers.length <= 3 * 104
-1000 <= numbers[i] <= 1000
numbers is sorted in non-decreasing order.
-1000 <= target <= 1000
The tests are generated such that there is exactly one solution.
*/
import java.util.Scanner;

public class Two_Sum_2_nput_Array_Is_Sorted {
    public static void bruteForce(int[] a, int target){
        for(int i=0 ; i<a.length ; i++){
            for(int j=i+1 ; j<a.length ; j++){
                if(a[i]+a[j] == target){
                    System.out.println(i+1 + " " + j+1);
                    break;
                }
            }
        }
    }
    public static void optimised(int[] a, int target){
        int low=0, high=a.length-1;
        while(low < high){
            if(a[low] + a[high] == target){
                System.out.println(low+1 + " " + high+1);
                break;
            }else{
                if(a[high] > target){
                    high--;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter elements:");
        for(int i=0 ; i<n ; i++)
            a[i] = sc.nextInt();

        System.out.println("Enter target:");
        int target = sc.nextInt();

        System.out.println("Brute Force Approach : TC = O(n^2)");
        bruteForce(a, target);
        System.out.println("Optimised Approach : TC = O(n)");
        optimised(a, target);
    }
}
