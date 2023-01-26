import java.util.Scanner;

// 1. You've to display the digits of a number.
// 2. Take as input "n", the number for which digits have to be displayed.
// 3. Print the digits of the number line-wise.

// Digits Of A Number

public class Ques5 {

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();

    int nod = 0;
    int tmp = n;

    while (tmp != 0) {
      tmp = tmp / 10;
      nod++;
    }
    int div = (int) Math.pow(10, nod - 1);

    while (div != 0) {
      int q = n / div;
      System.out.println(q);

      n = n % 10;
      div = div / 10;
    }
  }
}
