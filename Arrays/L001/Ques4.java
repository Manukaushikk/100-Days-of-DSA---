// Reverse An Array

// 1. You are given a number n, representing the size of array a.
// 2. You are given n numbers, representing elements of array a.
// 3. You are required to reverse the contents of array a.
import java.util.Scanner;

public class Ques4 {

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();

    int arr[] = new int[n];
    for (int idx = 0; idx < n; idx++) {
      arr[idx] = scn.nextInt();
    }
    reverse(arr);
    display(arr);
  }

  public static void display(int arr[]) {
    StringBuilder sb = new StringBuilder();

    for (int val : arr) {
      sb.append(val + "");
    }
    System.out.println(sb);
  }

  public static void reverse(int arr[]) {
    int left = 0, right = arr.length - 1;

    while (left < right) {
      int tmp = arr[left];
      arr[left] = arr[right];
      arr[right] = tmp;

      left++;
      right--;
    }
  }
}
