import java.util.Scanner;

// Max Of An Array

public class Ques9 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        System.out.println(maxOfArray(arr, 0));
    }

    public static int maxOfArray(int arr[], int idx) {
        if (idx == arr.length)
            return Integer.MIN_VALUE;

        int Omax = maxOfArray(arr, idx + 1);
        if (Omax > arr[idx])
            return Omax;
        return arr[idx];
    }
}
