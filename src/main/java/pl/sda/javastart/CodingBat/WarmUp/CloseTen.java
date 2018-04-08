package pl.sda.javastart.CodingBat.WarmUp;

import java.util.Scanner;

public class CloseTen {

    public static void main(String[] args) {

        Scanner cin = new Scanner(System.in);
        System.out.println("Podaj dwie liczby");
        int a = cin.nextInt();
        int b = cin.nextInt();
        System.out.println(close(a, b));
    }


    public static int close(int x, int y) {
        if (Math.abs(10 - x) == Math.abs(10 - y)) {

            return 0;
        }

        if (Math.abs(10 - x) < Math.abs(10 - y)) {

            return x;
        } else {

            return y;
        }

    }


}

