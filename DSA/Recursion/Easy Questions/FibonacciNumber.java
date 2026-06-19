public class FibonacciNumber {
    public static void main(String[] args) {
        int n = 10;
        int result = fib(n);
        System.out.println(result);
    }

    public static int fib(int n) {
        // base condition
        if (n < 2) {
            return n;
        }
        return fib(n-1) + fib(n-2);
    }
}
