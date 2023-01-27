import java.util.Scanner;

public class Ques7 {

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();

    int inv = 0;
    int orgiplace = 1;
    while (n != 0) {
      int orgidig = n % 10;
      int invertdig = orgiplace;
      int invertplace = orgidig;

      // make change to inv using ip and id
      inv = inv + invertdig * (int) Math.pow(10, invertplace - 1);

      n = n / 10;
      orgiplace++;
    }
    System.out.println(inv);
  }
}
