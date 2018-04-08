package pl.sda.javastart.day2;

import java.util.Scanner;

public class WitchOneIsBigger {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj liczby do porownania:");
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        if(x==y){

            System.out.println("Podałeś dwie takie same ");
        }

        if(x>y){

            System.out.println(x);
        }

        if(y>x){
            System.out.println(y);

        }

    }
}
