// 1. You've to count the number of digits in a number.
// 2. Take as input "n", the number for which the digits has to be counted.
// 3. Print the digits in that number.

// Count Digit in a Number 🔄️

import java.util.Scanner;

// package Basics&OOPS.Basic.L003;

public class Ques4 {

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();

    int dig = 0;
    while (n != 0) {
      n = n / 10;
      dig++;
    }
    System.out.println(dig);
  }
}
