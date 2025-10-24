

class Factorial {

    // Recursive method
    static int factorial(int n) {
        if (n == 1)  // base case (stop condition)
            return 1;
        else
            return n * factorial(n - 1);  // recursive call
    }

    public static void main(String[] args) {
        int result = factorial(5);
        System.out.println("Factorial of 5 is: " + result);
    }
}
