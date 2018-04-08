package pl.sda.javastart.CodingBat.WarmUpTwo;

import java.util.Scanner;

public class StringTimes {

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        String world = cin.nextLine();
        int x = cin.nextInt();
        System.out.println(times(world, x));
    }

    private static String times(String str, int n) {

        String newStr = "";
        str = str.trim();
        for (int i = 0; i < n; i++) {
            newStr = newStr + str;
        }
        return newStr;

    }
}

