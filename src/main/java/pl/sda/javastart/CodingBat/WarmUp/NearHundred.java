package pl.sda.javastart.CodingBat.WarmUp;

import java.util.Scanner;

public class NearHundred {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj liczbe: ");
        int x = scanner.nextInt();

        System.out.println(nearcheck(x));

    }

    public static boolean nearcheck(int x) {

       return ((Math.abs(100-x)<=10) ||  (Math.abs(200-x)<=10));
    }
}
