package pl.sda.javastart.CodingBat.WarmUp;

import java.util.Scanner;

public class HasTeen {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj trzy liczby");
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();
        System.out.println(teen(x, y, z));
    }

    private static boolean teen(int bX, int bY, int bZ) {


        return ((bX >= 13 && bX <= 19) ||
                (bY >= 13 && bY <= 19) ||
                (bZ >= 13 && bZ <= 19));

    }
}
