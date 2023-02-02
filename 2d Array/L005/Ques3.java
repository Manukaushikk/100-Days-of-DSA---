
// The State Of Wakanda 2
// 2d Arrays
import java.util.*;

public class Ques3 {

    public static void main(String[] args) {
        // write your code here
        Scanner scn = new Scanner(System.in);

        int nr = scn.nextInt();
        int nc = nr;
        int mat[][] = new int[nr][nc];

        fillmatrix(mat, scn);
        TheStateOfWakanda2(mat);

    }

    public static void fillmatrix(int mat[][], Scanner scn) {
        int nr = mat.length;
        int nc = mat[0].length;

        for (int r = 0; r < nr; r++) {
            for (int c = 0; c < nc; c++) {
                mat[r][c] = scn.nextInt();
            }
        }
    }

    public static void TheStateOfWakanda2(int mat[][]) {
        int n = mat.length;

        for (int gap = 0; gap < n; gap++) {
            // Diagonal st pt
            int r = 0, c = gap;

            while (r < n && c < n) {
                System.out.println(mat[r][c]);
                r++;
                c++;
            }
        }
    }
}