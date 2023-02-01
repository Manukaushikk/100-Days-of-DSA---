// First Index And Last Index

// 1. You are given a number n, representing the size of array a.
// 2. You are given n numbers, representing elements of array a.

// Asssumption - Array is sorted. Array may have duplicate values.

// package Arrays.L003;

import java.util.Scanner;

public class Ques10 {

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();

    int arr[] = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = scn.nextInt();
    }
    int k = scn.nextInt();
    System.out.println(FirstIdx(arr, k));
    System.out.println(LastIdx(arr, k));
  }

  public static int FirstIdx(int arr[], int k) {
    int left = 0, right = arr.length - 1;
    int idx = -1;
    while (left <= right) {
      int mid = (left + right) / 2;

      if (arr[mid] == k) {
        idx = mid;
        right = mid - 1;
      } else if (k > arr[mid]) {
        left = mid + 1;
      } else if (k < arr[mid]) {
        right = mid - 1;
      }
    }
    return idx;
  }

  public static int LastIdx(int arr[], int k) {
    int left = 0, right = arr.length - 1;
    int idx = -1;
    while (left <= right) {
      int mid = (left + right) / 2;

      if (arr[mid] == k) {
        idx = mid;
        left = mid + 1;
      } else if (k > arr[mid]) {
        left = mid + 1;
      } else if (k < arr[mid]) {
        right = mid - 1;
      }
    }
    return idx;
  }
}
