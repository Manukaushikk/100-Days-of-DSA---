// Find Element In An Array

// 1.You are given a number n, representing the size of array a.
// 2.You are given n distinct numbers, representing elements of array a.
// 3. You are given another number d.
// 4. You are required to check if d number exists in the array a and at what index (0 based). If found print the index, otherwise print -1.

import java.util.Scanner;

public class Ques3 {

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();

    int arr[] = new int[n];
    for (int idx = 0; idx < n; idx++) {
      arr[idx] = scn.nextInt();
    }
    int ele = scn.nextInt();
    FindInArray(arr, ele);
    // int ans = FindInArray(arr, ele);
    // System.out.println(ans);
  }

  public static void FindInArray(int arr[], int ele) {
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == ele) {
        System.out.println(i);
        return;
      }
    }
    System.out.println(-1);
  }
}
