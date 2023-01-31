// Inverse of An Array
import java.util.Scanner;

public class Ques6 {

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();

    int arr[] = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = scn.nextInt();
    }
    int inv[] = inverse(arr);
    display(inv);
  }

  public static int[] inverse(int arr[]) {
    int inv[] = new int[arr.length];
    for (int i = 0; i < inv.length; i++) {
      int v = arr[i];
      inv[v] = i;
    }
    return inv;
  }

  public static void display(int arr[]) {
    StringBuilder sb = new StringBuilder();

    for (int vl : arr) {
      sb.append(vl + "\n");
    }
    System.out.println(sb);
  }
}
