package pl.sda.javastart.day1;


import java.time.LocalDateTime;
import java.util.Scanner;

public class exercise1 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("O której godzinie wstałes?");
        double a = scanner.nextDouble();
        System.out.println("+ minuty");
        double b = scanner.nextDouble();

        LocalDateTime localDate = LocalDateTime.now();

        int minuta = localDate.getMinute();
        int godzina = localDate.getHour();
        int rok = localDate.getYear();
        int miesiac = localDate.getMonthValue();
        int dzien = localDate.getDayOfMonth();


        if (miesiac > 0 && miesiac < 10) System.out.println(godzina + ":" + minuta + "  " + "" + dzien + "." + "0" + miesiac + "." + rok + "r.");
        else System.out.println(godzina + ":" + minuta + "  " + "" + dzien + "." + miesiac + "." + rok + "r.");
        System.out.printf("Minęło %.0f minut od kiedy wstałeś\n", ((godzina * 60 - a * 60) + (Math.abs(minuta - b))));
        float ile = ((godzina * 60 + minuta) * 100) / 1440;
        System.out.printf("Minęło: %.0f%%", ile);


    }
}
