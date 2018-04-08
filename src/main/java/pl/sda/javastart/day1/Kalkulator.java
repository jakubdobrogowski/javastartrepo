package pl.sda.javastart.day1;

import java.util.Scanner;


public class Kalkulator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Wprowadz pierwsza liczbe");
        double a = scanner.nextDouble();
        System.out.println("Wprowadz druga liczbe");
        double b = scanner.nextDouble();

        System.out.println("" + a + " + " + b + " = " +adder(a,b)) ;
        System.out.println("" + a + " - " + b + " = " +(a-b)) ;
        System.out.println("" + a + " * " + b + " = " +(a*b)) ;
        System.out.println("" + a + " / " + b + " = " +(a/b)) ;
        System.out.println("" + a + " % " + b + " = " +(a%b)) ;

        System.out.println("a + b = " +  (a*b));
        System.out.println("a + b = " + multiplier(a,b));

        System.out.println("Wartosc bezwzgledna: " + Math.abs(b-a));
        System.out.printf("Wartość bezwzględna: %.1f", a ); // double ale na koncu i tak f oraz wazna roznica
        System.out.println("Wartosc min: " + Math.min(a,b));
        System.out.println("Wartosc max: " + Math.max(a,b));
        System.out.println("Do potęgi: " + Math.pow(a,b));



    }

    public static double multiplier (double a, double b){

        return a*b;
    }


    public static double adder (double ia, double ib){

        return ia+ib;
    }
}
