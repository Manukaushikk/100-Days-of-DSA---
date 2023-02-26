
// Write a code to find Fibonacci Series using Recursion
public class Main {
    public static void main(String[] args) {
        int n = 4;
        System.out.println(Fibonacci(n));
    }

    public static int Fibonacci(int n) {
        if (n <= 1)
            return n;
        return Fibonacci(n - 1) + Fibonacci(n - 2);
    }
}
