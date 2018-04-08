package pl.sda.javastart.CodingBat.Array1;

public class FirstLastSix {

    public static void main(String[] args) {

        int arrayInt[] = {};

        System.out.println(six(arrayInt));
    }

    private static boolean six(int[] arrayInt) {

        if (arrayInt.length >= 1) {

            if (arrayInt[0] == 6 || arrayInt[arrayInt.length - 1] == 6) {
                return true;
            }
            return false;
        } else {

            return false;

        }
    }
}
