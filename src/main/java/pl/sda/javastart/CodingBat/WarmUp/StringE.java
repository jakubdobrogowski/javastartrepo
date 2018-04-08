package pl.sda.javastart.CodingBat.WarmUp;

import java.util.Scanner;

public class StringE {

    public static void main(String[] args) {

        Scanner cin = new Scanner(System.in);
        System.out.println("Podaj wyraz");
        String world = cin.nextLine();
        System.out.println(string(world));

    }

    private static boolean string(String str) {

        char[] tabChar = str.toCharArray();
        int value = 0;
        for (int i = 0; i < str.length(); i++) {

            if (tabChar[i] == 'e') {
                value++;
            }
        }

        if (value >= 1 && value <= 3) {

            return true;
        } else {

            return false;
    }
}


}
