package pl.sda.javastart.CodingBat.WarmUp;


import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class StartHi {

    public static void main(String[] args) {

        System.out.println("Przywitaj sie:");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        //String str = " hi mark";
        System.out.println(hi(str));

        System.out.println(hiTwo(str));
    }

    private static boolean hiTwo(String bStr) {

        if (bStr.length() < 2) {
            return false;
        }

        String actualeValueone = bStr.trim();
        String actualeValue = actualeValueone.toLowerCase();
        String firstTwo = actualeValue.substring(0, 2);

        if (firstTwo.equals("hi")) {
            return true;

        } else {

            return false;
        }


    }

    private static boolean hi(String bStr) {

        String actualeValueone = bStr.trim();
        String actualeValue = actualeValueone.toLowerCase();
        return actualeValue.startsWith("hi");

    }
}
