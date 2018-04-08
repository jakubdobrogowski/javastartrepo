package pl.sda.javastart.CodingBat.WarmUp;

import java.util.Scanner;

public class MixStart {

    public static void main(String[] args) {

        Scanner cin = new Scanner(System.in);

        System.out.println("Podaj slowo z ix\"");
        String world = cin.nextLine();
        System.out.println(mix(world));
    }

    private static boolean mix(String str) {
        str = str.trim();
        if (str.length() < 3) {
            return false;
        }
        String newStr = str.substring(1, 3);
        if (newStr.equals("ix")) {
            return true;

        } else {

            return false;
        }
    }
}
