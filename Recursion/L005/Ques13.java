import java.util.*;

// Print Maze Path using Jump
public class Ques13 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();

        ArrayList<String> res = getMazePaths(0, 0, n - 1, m - 1);
        System.out.println(res);
    }

    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
        // Invalid
        if (sr > dr || sc > dc) {
            ArrayList<String> base = new ArrayList<>();
            return base;
        }
        // Valid
        if (sr == dr && sc == dc) {
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }

        ArrayList<String> hpath = getMazePaths(sr, sc + 1, dr, dc);
        ArrayList<String> vpath = getMazePaths(sr + 1, sc, dr, dc);

        ArrayList<String> path = new ArrayList<>();

        // Horizontal
        for (String p : hpath) {
            path.add("h" + p);
        }

        // Vertical
        for (String p : vpath) {
            path.add("v" + p);

        }
        return path;

    }
}
