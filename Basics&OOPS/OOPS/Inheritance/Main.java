// package OOPS.Inheritance;
import java.util.*;

public class Main {

  public static void main(String[] args) {
    AdvCalc obj = new AdvCalc();
    // Calc obj = new Calc();
    int r1 = obj.add(2, 2);
    int r2 = obj.sub(2, 2);
    int r3 = obj.multi(2, 2);
    int r4 = obj.div(2, 2);

    System.out.println(r1 + " " + r2 + " " + r3 + " " + r4 + " ");
    // System.out.println(r1 + " " + r2);
  }
}
