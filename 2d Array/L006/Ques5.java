// Spiral Display

// 1. You are given a number n, representing the number of rows.
// 2. You are given a number m, representing the number of columns.
// 3. You are given n*m numbers, representing elements of 2d array a.
// 4. You are required to traverse and print the contents of the 2d array in form of a spiral.
// Note - Please check the sample output for details.

import java.util.*;

public class Ques5 {
    public static void main(String[] args) {
        // // spiral
        Scanner scn = new Scanner(System.in);

        int nr = scn.nextInt(), nc = scn.nextInt();
        int mat[][] = new int[nr][nc];
        for (int i = 0; i < nr; i++) {
            for (int j = 0; j < nc; j++) {
                mat[i][j] = scn.nextInt();
            }
        }

        spiralDisplay(mat);
    }

    public static void spiralDisplay(int mat[][]) {
        // write your code here
        int rmin = 0, cmin = 0, rmax = mat.length - 1, cmax = mat[0].length - 1;
        int tne = mat.length * mat[0].length;
        int count = 0;

        while (count < tne) {

            // left wall
            for (int r = rmin, c = cmin; r <= rmax && count < tne; r++) {
                System.out.println(mat[r][c]);
                count++;
            }
            // bottom wall
            for (int r = rmax, c = cmin + 1; c <= cmax && count < tne; c++) {
                System.out.println(mat[r][c]);
                count++;
            }
            // right wall
            for (int r = rmax - 1, c = cmax; r >= rmin && count < tne; r--) {
                System.out.println(mat[r][c]);
                count++;
            }
            // top wall
            for (int r = rmin, c = cmax - 1; c >= cmin + 1 && count < tne; c--) {
                System.out.println(mat[r][c]);
                count++;
            }

            rmin++;
            rmax--;
            cmin++;
            cmax--;

        }
    }
}