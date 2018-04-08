package pl.sda.javastart.day2;

import java.util.Scanner;

public class Arrayexamples {

    public static void main(String[] args) {

        printNamesWithComma();

    }

    private static void printNamesWithComma() {
        Scanner cin = new Scanner(System.in);

       String[] names = new String[5];

        int i=0;

        do{
            System.out.println("Podaj kolejne iminona: ");
            String name =  cin.nextLine();
            names [i] = name;
            i++;
        }while(i < 5);

        for(String name : names) {

            System.out.println(name + ", ");
        }
    }


}
