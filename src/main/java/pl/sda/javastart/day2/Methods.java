package pl.sda.javastart.day2;

import java.util.Scanner;

public class Methods {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("a= ");
        int a = scanner.nextInt();
        System.out.println("b= ");
        int b = scanner.nextInt();

        System.out.println("Podaj wartosc w calach aby zamienic na metry: ");
        int c = scanner.nextInt();

          System.out.printf("Pole prostkata %.0f", rectangle(a, b));
          System.out.printf("obdwod prostkata %.0f", rectanglePermiter(a, b));
          System.out.printf("W metrach to: %.4f", inchToMeter(c));

        int minutes = 2880;

        minutesToDateValue(minutes);

    }

    public static double rectangle(double a, double b) {

        return a * b;
    }

    public static double rectanglePermiter(double a, double b) {

        return 2 * a + 2 * b;
    }

    public static double inchToMeter(double c) {

        return c * 0.0254;
    }

    public static void minutesToDateValue(int minutes) {

        double years = minutes / 525600;
        double months = minutes / 17200;
        double days = minutes / 1440;

        System.out.printf("y: %.0f m: %.0f d: %.0f", years, months, days);




    }

}
