import java.util.Scanner;

// 2d Arrays Demo
// Easy

// 1. You are given a number n, representing the number of rows.
// 2. You are given a number m, representing the number of columns.
// 3. You are given n*m numbers, representing elements of 2d array a.
// 4. You are required to display the contents of 2d array as suggested by output format below.

// Constraints
// 1 <= n <= 10^2
// 1 <= m <= 10^2

// Sample Input

// 2
// 4
// 11
// 12
// 13
// 14
// 21
// 22
// 23
// 24

// Sample Output
// 11 12 13 14
// 21 22 23 24

public class Ques1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int nr = scn.nextInt();
        int nc = scn.nextInt();
        int mat[][] = new int[nr][nc];
        fillMatrix(mat, scn);
        display(mat);
    }

    public static void fillMatrix(int mat[][], Scanner scn) {
        int nr = mat.length;
        int nc = mat[0].length;
        for (int r = 0; r < nr; r++) {
            for (int c = 0; c < nc; c++) {
                mat[r][c] = scn.nextInt();
            }
        }
    }

    public static void display(int mat[][]) {
        int nr = mat.length;
        int nc = mat[0].length;
        for (int r = 0; r < nr; r++) {
            for (int c = 0; c < nc; c++) {
                System.out.print(mat[r][c] + " ");
            }
            System.out.println();
        }
    }
}
