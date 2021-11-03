package Array_Problems;

import java.util.Scanner;

public class Medium_of_two_sorted_arrays {
    // TC = O(n1 + n2), SC = O(n1 + n2)
    public static int median_brute_force(int[] a1, int[] a2){

        int median = 0;

        int n1 = a1.length, n2 = a2.length;
        int[] temp = new int[n1+n2];    // for storing the elements of the arrays a1 and a2 in sorted order
        int i=0, j=0, k=0;
        while(i < n1 && j< n2){

            if(a1[i] <= a2[j]){
                temp[k] = a1[i];
                i++;
            }else{
                temp[k] = a2[j];
                j++;
            }
            k++;
        }
        if(i >= n1){
            while(j < n2){
                temp[k] = a2[j];
                j++;
                k++;
            }
        }else{
            while(i < n1){
                temp[k] = a1[i];
                i++;
                k++;
            }
        }

        if(temp.length % 2 != 0)
            median = temp[temp.length/2];
        else{
            median = (temp[temp.length/2] + temp[temp.length/2 - 1])/2;
        }
        return median;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of first array n1:");
        int n1 = sc.nextInt();
        System.out.println("Enter elements of the first array:");
        int[] a1 = new int[n1];
        for(int i=0 ; i<n1 ; i++)
            a1[i] = sc.nextInt();

        System.out.println("Enter size of the second array n2 :");
        int n2 = sc.nextInt();
        System.out.println("Enter the elements of the second array:");
        int[] a2 = new int[n2];
        for(int i=0 ; i<n2 ; i++)
            a2[i] = sc.nextInt();

        System.out.println("Median by Brute force : " + median_brute_force(a1, a2));
    }
}
