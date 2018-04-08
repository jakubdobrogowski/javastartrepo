package pl.sda.javastart.day2;

import java.util.Scanner;

public class whiles {

    public static void main(String[] args) {

        whileBasic();
    }

    private static void whileBasic() {

        Scanner scanner = new Scanner (System.in);
        System.out.println("wprowadz ilosc powtotzen");
        double howManyTimes =  scanner.nextDouble();

        int i =0;

        while(i<howManyTimes){

            System.out.println("Cześć tu pętla while po raz " + (i+1));
            ++i;
        }

    }
}
