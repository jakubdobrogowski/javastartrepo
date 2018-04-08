package pl.sda.javastart.CodingBat.WarmUp;

import java.util.Scanner;

public class MissingChar {

    public static void main(String[] args) {

        String cat = "kitten";
        System.out.println("Podaj która litera ma zostac wycięta");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();

        System.out.println(miss(cat, x));

        missTwo(cat, x);



    }

    private static void missTwo(String str, int n) {

        if (n >= 0 && n <= str.length() - 1) {


            char[] t = str.toCharArray();

            for (int i = 0; i < str.length(); i++) {

                if (i == n) {
                    continue;
                }
                System.out.print(t[i]);
            }

        } else {

            System.out.println("Podałeś złą liczbe!");
        }
    }


    public static String miss(String str, int n) {

        if (n >= 0 && n <= str.length() - 1) {


            return str.substring(n);

        } else {
            return String.format("Liczba spoza zakresu!");

        }


    }




}
