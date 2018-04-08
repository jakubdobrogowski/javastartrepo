package pl.sda.javastart.day2;

import java.time.LocalDateTime;
import java.util.stream.IntStream;

public class Fors {

    public static void main(String[] args) {

        //  tenTimes();
        //  piramida();


    }

    public static void tenTimes() {

        for (int i = 0; i < 10; i++) {

            System.out.println(i);
        }
    }


    public static void piramida() {

        for (int i = 0; i < 10; i++) {

            for (int k = 0; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }


    public static void printNatural(int min, int max) {

        IntStream.range(min, max + 1).filter(element -> element % 2 == 0).forEach(e -> System.out.println(e));
    }

    public static void printFewNaturalNumbersEvenWithContinue(int min, int max) {
        for (int i = min; i <= max; i++) {
            if (i % 2 != 0) {
                continue; //przejście do następnej iteracji
            }
            System.out.println(i);
        }
    }


}



