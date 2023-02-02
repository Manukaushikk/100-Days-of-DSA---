import java.util.Scanner;

// Subarray Problem
// 1. You are given an array of size 'n' and n elements of the same array.
// 2. You are required to find and print all the subarrays of the given array. 
// 3. Each subarray should be space seperated and on a seperate lines. Refer to sample input and output.

public class Ques12 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        printallSubarray(arr);
    }

    public static void printallSubarray(int arr[]) {
        for (int sp = 0; sp < arr.length; sp++) {
            for (int ep = sp; ep < arr.length; ep++) {

                for (int i = sp; i <= ep; i++) {
                    System.out.print(arr[i] + "\t");
                }
                System.out.println();
            }
        }
    }
}
