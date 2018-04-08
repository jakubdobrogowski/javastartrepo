package pl.sda.javastart.CodingBat.WarmUpTwo;

public class NoTriples {

    public static void main(String[] args) {

        int[] iarray = {1, 2, 3, 2, 3, 4, 5};
        System.out.println(trples(iarray));
    }

    private static boolean trples(int[] array) {

        for (int i = 0; i < array.length - 2; i++) {

            if (array[i] == array[i + 1] && array[i] == array[i + 2] && array[i + 1] == array[i + 2]) {

                return false;
            }
        }
        return true;
    }


}
