package pl.sda.javastart.CodingBat.WarmUpTwo;

import java.util.Scanner;

public class DoubleX {
    public static void main(String[] args) {

        Scanner cin = new Scanner(System.in);
        System.out.println("Podaj slowo:");
        String world = cin.nextLine();
        //  System.out.println(doublexx(world));

        System.out.println(doubleX(world));
    }

    public static boolean doublexx(String str) {


        if (str.contains("xx")) {

            return true;
        }

        return false;
    }


    public static boolean doubleX(String str) { // fajna opcja tu jest

        int i = str.indexOf("x");

        if (i == -1) {
            return false;
        }

        if (i + 1 >= str.length()) {
            return false;
        }

        return str.substring(i + 1, i + 2).equals("x");


    }
}
