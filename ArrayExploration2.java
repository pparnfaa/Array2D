package Array_2d;

import java.util.Scanner;

public class ArrayExploration2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int row = scan.nextInt();
        int col = scan.nextInt();
        int arr[][] = new int[row + 1][col + 1];
        for (int i = 1; i < row + 1; i++) {
            for (int j = 1; j < col + 1; j++) {
                arr[i][j] = scan.nextInt();
            }
        }
        int num = scan.nextInt();
        int count_pass = 0;
        int count_neg = 0;
        int count_even = 0;
        int count_odd = 0;
        int y = 0;
        int y2 = 0;
        for (int k = 1; k < num + 1; k++) {
            int x = scan.nextInt();
            int x2 = scan.nextInt();
            if (x >= 1 && x <= row && x2 >= 1 && x2 <= col) {
                y = x;
                y2 = x2;
                if (arr[x][x2] > 0) {
                    count_pass++;
                    if (arr[x][x2] % 2 == 0) {
                        count_even++;
                    } else {
                        count_odd++;
                    }
                } else if (arr[x][x2] < 0) {
                    count_neg++;
                    if (arr[x][x2] % 2 == 0) {
                        count_even++;
                    } else {
                        count_odd++;
                    }
                } else {
                    count_even++;
                }
            } else {
                if (arr[y][y2] > 0) {
                    count_pass++;
                    if (arr[y][y2] % 2 == 0) {
                        count_even++;
                    } else {
                        count_odd++;
                    }
                } else if (arr[y][y2] < 0) {
                    count_neg++;
                    if (arr[y][y2] % 2 == 0) {
                        count_even++;
                    } else {
                        count_odd++;
                    }
                } else {
                    count_even++;
                }
            }
        }
        System.out.println(count_pass + " " + count_neg + " " + count_even + " " + count_odd);
    }
}
