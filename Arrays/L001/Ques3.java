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
