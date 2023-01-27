import java.util.Scanner;

public class Pattern4 {

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();

    int space = 0;
    int star = n;

    for (int i = 0; i <= n; i++) {
      //   System.out.print(space + "->" + star);

      for (int j = 1; j <= space; j++) {
        System.out.print("\t");
      }

      for (int j = 1; j <= star; j++) {
        System.out.print("*\t");
      }
      space++;
      star--;
      System.out.println();
    }
  }
}
