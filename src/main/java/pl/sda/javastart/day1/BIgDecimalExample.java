package pl.sda.javastart.day1;

import java.math.BigDecimal;

public class BIgDecimalExample {

    public static void main(String[] args) {

        double x = 0.02;
        double y = 0.03;
        double z =  x - y;

        System.out.println(z);

        BigDecimal a = new BigDecimal("0.02");

        BigDecimal c = BigDecimal.valueOf(0.04);

        BigDecimal b = new BigDecimal("0.03");

        System.out.println(a.subtract(b));

        System.out.println(c.subtract(a));




    }
}
