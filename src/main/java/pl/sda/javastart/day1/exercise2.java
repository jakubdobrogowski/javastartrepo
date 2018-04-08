package pl.sda.javastart.day1;

import java.util.Scanner;

import static java.lang.StrictMath.sqrt;

public class exercise2 {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj wartość a: ");
        int a = scanner.nextInt();
        System.out.println("Podaj wartość b: ");
        int b = scanner.nextInt();
        System.out.println("Podaj wartość c: ");
        int c = scanner.nextInt();


        if(a==0) System.out.println("To nie jest równanie kwadratowe");
        else{
            double delta = b*b-4*a*c;
            if(delta==0) System.out.println("x= " + ((-1)*b/(2*a)));

                if(delta<0) System.out.println("Delta mniejsza od zera");
                else{

                    double pierwiastek = sqrt(delta);

                    double xone = ((-1) * b - pierwiastek) / 2 * a;
                    double xtwo = ((-1) * b + pierwiastek) / 2 * a;

                    System.out.printf("X1= %.1f ", xone);
                    System.out.printf("X1= %.1f ", xtwo);
                }

            }

        }

    }

