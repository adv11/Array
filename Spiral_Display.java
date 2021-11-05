package Java_pepcoding;

import java.util.Scanner;

public class Spiral_Display {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows:");
        int r = sc.nextInt();
        System.out.println("Enter number of columns:");
        int c = sc.nextInt();

        int[][] a = new int[r][c];
        System.out.println("Enter elements of the array");
        for(int i=0 ; i<r ; i++)
            for(int j=0 ;  j<c ; j++)
                a[i][j] = sc.nextInt();

        int minr = 0, minc = 0;
        int maxr = a.length-1, maxc = a[0].length-1;

        // left wall - minc
        // bottom wall - maxr
        // right wall - maxc
        // top wall - minr
        int count = 0;
        int total = r*c;
        System.out.println("Spiral Display of elements is:");
        while(count < total){

            // left wall
            for(int i=minr, j=minc ; i<=maxr && count<total ; i++){
                System.out.println(a[i][j]);
                count++;
            }
            minc++;
            // bottom wall
            for(int i=maxr, j=minc ; j<=maxc && count<total  ; j++){
                System.out.println(a[i][j]);
                count++;
            }
            maxr--;
            // right wall
            for(int i=maxr, j=maxc ; i>=minr && count<total ; i--){
                System.out.println(a[i][j]);
                count++;
            }
            maxc--;
            // top wall
            for(int i=minr, j=maxc ; j>=minc && count<total ; j--){
                System.out.println(a[i][j]);
                count++;
            }
            minr++;
        }
    }
}
