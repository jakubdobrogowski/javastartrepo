package pl.sda.javastart.CodingBat.WarmUp;

import java.util.Scanner;

public class EveryNth {

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.println("Podaj słowo:");
        String world = cin.nextLine();
        System.out.println("Podaj co ktura litera ma zostac wypisana:");
        int x = cin.nextInt();
        System.out.println(every(world, x));

    }

    private static String every(String str, int n) {
        String result = "";
        if (n > 1) {
            int v = n;
            for (int i = 0; i <= str.length(); i++) {

                if (i == n) {
                    n = n + v;
                    result = result + str.charAt(i);
                }
            }
        }

        return str.charAt(0) + result;
    }

}
