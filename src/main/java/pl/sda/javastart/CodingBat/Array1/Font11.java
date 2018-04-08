package pl.sda.javastart.CodingBat.Array1;

public class Font11 {


    public static void main(String[] args) {

        int[] x = {};
        int[] y = {};

        font(x,y);
    }

    private static int[] font(int[] a, int[] b) {


        if (a.length == 0 && b.length != 0) {

            return new int[]{b[0]};
        }

        if (b.length == 0 && a.length != 0) {

            return new int[]{a[0]};
        }

        if (b.length == 0 && a.length == 0) {

            int[] tablica = {};
            return tablica;
        }

        int[] tab = {a[0], b[0]};
        return tab;

    }

}
