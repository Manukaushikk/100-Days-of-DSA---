
import java.util.Scanner;

// Display Reverse Array

public class Ques8 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = scn.nextInt();

        DisplayReverseArr(arr, 0);

    }

    public static void DisplayReverseArr(int arr[], int idx) {
        if (idx == arr.length)
            return;
        DisplayReverseArr(arr, idx + 1); // Faith
        System.out.println(arr[idx]);
    }
}
