import java.util.Scanner;

public class Ques2 {

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

    int n = scn.nextInt();
    int arr[] = new int[n];
    for (int idx = 0; idx < n; idx++) {
      arr[idx] = scn.nextInt();
    }
    int ans = SpanOfArray(arr);
    System.out.println("ANS" + " " + ans);
  }

  public static int SpanOfArray(int arr[]) {
    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;

    for (int vl : arr) {
      if (vl > max) {
        max = vl;
      }
      if (vl < min) {
        min = vl;
      }
    }
    return max - min;
  }
}
