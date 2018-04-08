package pl.sda.javastart.day2;

import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        System.out.println("napipsz");
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();

        yearCheck(x);

    }

    public static void yearCheck (int year){

        if(year%400==0|| year%4==0) {
            System.out.println("Rok jest przystępny");
        } else {
            System.out.println("Rok jest nieprzestepny");
        }
    }

}
