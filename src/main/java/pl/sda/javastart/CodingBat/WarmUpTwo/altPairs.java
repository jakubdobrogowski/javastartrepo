package pl.sda.javastart.CodingBat.WarmUpTwo;

import java.util.Scanner;

public class altPairs {

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.println("Podaj wyraz");
        String world = cin.nextLine();
        System.out.println(alt(world));
        System.out.println(altTwo(world));
    }

    public static String altTwo(String str) {
        String result = "";
        //char[] arrayChar = str.toCharArray();
        for (int i = 0; i < str.length(); i += 4) {
            int end = i + 2;
            if (end > str.length()) {           /// wazny warunek
                end = str.length();
            }
            result = result + str.substring(i, end);
        }
        return result;
    }

    public static String alt(String str) {

        char[] arrayChar = str.toCharArray();
        int n = 0;
        int m = 1;
        String value = "";
        for (int i = 0; i < str.length(); i++) {

            if (i == n) {

                value = value + arrayChar[i];
                n = n + 4;

            }

            if (i == m) {

                value = value + arrayChar[i];
                m = m + 4;
            }
        }
        return value;
    }


}
