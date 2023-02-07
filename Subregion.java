package Array_2d;

import java.util.Scanner;

import javax.print.event.PrintEvent;

public class Subregion {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // int row , col
        int r = scan.nextInt();
        int c = scan.nextInt();
        // int pos of left corner
        int p = scan.nextInt();
        int q = scan.nextInt();
        // int area
        int h = scan.nextInt();
        int w = scan.nextInt();
        int arr[][] = new int[r + 1][c + 1];
        if (p > 1 && p < r && q > 1 && q < c) {
            for (int i = 1; i < r + 1; i++) {
                for (int j = 1; j < c + 1; j++) {
                    arr[i][j] = 0;
                }
            }
            // int start = arr[p][q];
            for (int i = p; i < p + h; i++) {
                for (int j = q; j < q + w; j++) {
                    arr[i][j] = 1;
                }
            }

            for (int i = 1; i < r + 1; i++) {
                for (int j = 1; j < c + 1; j++) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println("");
            }
            // p + h < 1 && p + h > r && q + w < 1 && q + w > c
        } else {
            System.out.println("invalid input");
        }
    }
}
