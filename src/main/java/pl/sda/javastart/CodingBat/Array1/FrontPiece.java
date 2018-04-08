package pl.sda.javastart.CodingBat.Array1;

public class FrontPiece {

    public static void main(String[] args) {

        int[] x = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        pieces(x);
    }

    private static int[] pieces(int[] a) {

        if (a.length == 0) {

            int[] tablica = {};

            return tablica;
        }

        if (a.length == 1) {

            return new int[]{a[0]};
        }

        int[] tab = {a[0], a[1]};
        return tab;
    }
}
