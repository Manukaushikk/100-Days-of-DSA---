import java.util.Scanner;

public class Ques1 {

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int x = scn.nextInt();

    for (int i = 0; i < x; i++) {
      int n = scn.nextInt();

      int count = 0;
      for (int div = 2; div * div <= n; div++) {
        if (n % div == 0) {
          count++;
        }
      }
      if (count == 0) {
        System.out.println(n + "->" + "prime");
      } else {
        System.out.println(n + "->" + "NOT prime");
      }
    }
  }
}
