import java.util.Scanner;

// Squares of a Sorted Array

class Ques6 {
    public int[] sortedSquares(int[] nums) {
        int p1 = 0, p2 = nums.length - 1;
        int arr[] = new int[nums.length];
        int idx = nums.length - 1;
        while (p1 <= p2) {
            if (nums[p1] * nums[p1] >= nums[p2] * nums[p2]) {
                arr[idx] = nums[p1] * nums[p1];
                p1++;
            } else {
                arr[idx] = nums[p2] * nums[p2];
                p2--;
            }
            idx--;
        }
        return arr;
    }
}