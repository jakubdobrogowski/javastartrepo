package pl.sda.javastart.CodingBat.WarmUp;

import java.util.Scanner;

public class Diff21 {

    public static void main(String[] args) {

        System.out.println("Podaj liczbe:");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        System.out.println(diff21(n));

    }

    public static int diff21(int n) {

        if (n < 21) {

            return Math.abs(n - 21);
        } else {

            return (n - 21) * 2;
        }


    }
}