package pl.sda.javastart.JavaPodstawy;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Calendar {

    public static void main(String[] args) {


        LocalDate date = LocalDate.now();
        int today = date.getDayOfMonth();
        int month = date.getMonthValue();

        date = date.minusDays(today - 1);

        DayOfWeek weekday = date.getDayOfWeek();
        int value = weekday.getValue();

        System.out.println("Pn     Wt     Śr     Cz     Pt     Sb     Nd");

        for (int i = 1; i <= 7; i++) {

            if (value == i) {

                int[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

                for (int j = i; j < array.length; j++) {

                    for (int k = 0; k < j; k++) {

                        System.out.print("      ");
                    }

                    System.out.print(array[7 - value + 1] + "     ");

                }
            }
        }
        System.out.println();

        if (month == 2) {
            month = 28;
        } else if (month == 8) {
            month = 31;

        } else if (month % 2 == 1) {

            month = 31;
        } else {

            month = 30;
        }

        for (int i = 7 - value + 2; i <= month; i++) {

            System.out.print(i + "     ");
            if (i >= 1 && i <= 9) {
                System.out.print(" ");
            }
            if (i == 7 - value + 1 + 7 || i == 7 - value + 1 + 14 || i == 7 - value + 1 + 21 || i == 7 - value + 1 + 28) {
                System.out.println();
            }
        }
    }
}
