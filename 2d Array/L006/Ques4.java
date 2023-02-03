import java.util.Scanner;

// Exit Point Of A Matrix

// 1. You are given a number n, representing the number of rows.
// 2. You are given a number m, representing the number of columns.
// 3. You are given n*m numbers (1's and 0's), representing elements of 2d array a.
// 4. Consider this array a maze and a player enters from top-left corner in east direction.
// 5. The player moves in the same direction as long as he meets '0'. On seeing a 1, he takes a 90 deg right turn.
// 6. You are required to print the indices in (row, col) format of the point from where you exit the matrix.

public class Ques4 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int nr = scn.nextInt(), nc = scn.nextInt();
        int mat[][] = new int[nr][nc];

        for (int i = 0; i < nr; i++) {
            for (int j = 0; j < nc; j++) {
                mat[i][j] = scn.nextInt();
            }
        }
        exitPoint(mat);

    }

    public static void exitPoint(int mat[][]) {
        int nr = mat.length, nc = mat[0].length;

        // init
        // D : 0 -> E, 1 -> S, 2 -> West, 3 -> N
        int r = 0, c = 0, dir = 0;

        int ans_row = -1, ans_col = -1;

        while (!(r < 0 || c < 0 || r >= nr || c >= nc)) {
            dir = (dir + mat[r][c]) % 4;

            // Store previous coordinate
            ans_row = r;
            ans_col = c;
            // change
            if (dir == 0)
                c++;
            else if (dir == 1)
                r++;
            else if (dir == 2)
                c--;
            else
                r--;

        }
        System.out.println(ans_row);
        System.out.println(ans_col);
    }
}
