import java.util.Scanner;

// Last Index
public class Ques11 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        int k = scn.nextInt();
        System.out.println("LastIndex :-" + " " + lastIndex(arr, 0, k));
    }

    public static int lastIndex(int arr[], int idx, int k) {
        if (idx == arr.length) {
            return -1;
        }

        int rres = lastIndex(arr, idx + 1, k);

        if (rres == -1) {
            if (arr[idx] == k) {
                return idx;
            } else {
                return -1;
            }
        } else {
            return rres;
        }

    }
}
