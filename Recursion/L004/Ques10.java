import java.util.Scanner;

public class Ques10 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = scn.nextInt();

        int k = scn.nextInt();
        System.out.println(firstIndex(arr, 0, k));

    }

    public static int firstIndex(int arr[], int idx, int k) {
        if (idx == arr.length) {
            return -1;
        }
        if (arr[idx] == k) {
            return idx;
        } else {
            return (arr, idx + 1, k);
        }
    }
}
