import java.util.Scanner;

// Rotate An Array 🔫

// 1. You are given a number n, representing the size of array a.
// 2. You are given n numbers, representing elements of array a.
// 3. You are given a number k.
// 4. Rotate the array a, k times to the right (for positive values of k), and to
// the left for negative values of k.

public class Ques5 {

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();

    int arr[] = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = scn.nextInt();
    }
    int k = scn.nextInt();

    rotate(arr, k);
    display(arr);
    // reverse(arr, n, k);
  }

  public static void reverse(int arr[], int left, int right) {
    // int left = 0, right = arr.length;
    while (left < right) {
      int tmp = arr[left];
      arr[left] = arr[right];
      arr[right] = tmp;
      left++;
      right--;
    }
  }

  public static void rotate(int arr[], int k) {
    k = k % arr.length;
    if (k < 0) k = k + arr.length;

    // REVERSE PART 2 🔀
    reverse(arr, arr.length - k, arr.length - 1);
    // REVERSE PART 1 🔀
    reverse(arr, 0, arr.length - k - 1);
    // COMPLETE PART REVERSE🔀
    reverse(arr, 0, arr.length - 1);
  }

  public static void display(int arr[]) {
    for (int vl : arr) {
      System.out.println(vl + " ");
    }
  }
}
