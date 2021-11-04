package Java_pepcoding;

import java.util.Scanner;

public class The_State_Of_Wakanda_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows:");
        int r = sc.nextInt();
        System.out.println("Enter number of columns:");
        int c = sc.nextInt();

        int[][] a = new int[r+1][c+1];
        System.out.println("Enter elements:");
        for(int i=1 ; i<=r ; i++){
            for(int j=1 ; j<=c ; j++){

                a[i][j] = sc.nextInt();
            }
        }

        for(int j=1 ; j<=c ; j++){
            if(j % 2 != 0){
                for(int i=1 ; i<=r ; i++){
                    System.out.println(a[i][j]);
                }
            }else{
                for(int i=r ; i>=1 ; i--){
                    System.out.println(a[i][j]);
                }
            }
        }
    }
}
