package pl.sda.javastart.day2;

import java.util.Arrays;

public class Sum {

    public static void main(String[] args) {

        sumElementsOfArray(new int[]{1, 2, 3});
    }

    private static void sumElementsOfArray(int [] array) {

        int sum = Arrays.stream(array).sum();
        System.out.println(sum);

    }
}
