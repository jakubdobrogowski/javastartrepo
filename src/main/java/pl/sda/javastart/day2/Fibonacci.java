package pl.sda.javastart.day2;

public class Fibonacci {

    public static void main(String[] args) {

        System.out.println(fibonacciRekurencja(8));
    }

    private static int fibonacciRekurencja(int n) {

        if (n < 2) {

            return n;
        }

        return fibonacciRekurencja(n - 1) + fibonacciRekurencja(n - 2);

        // TO JEST TO SAMO return n < 2 ? n : fibonacciRekurencja(n - 1) + fibonacciRekurencja(n - 2);
    }
}
