package pl.sda.javastart.CodingBat.Array1;

public class CommonEnd {

    public static void main(String[] args) {

        int[] x = {1, 2, 3, 4};
        int[] y = {1};
        System.out.println(common(x, y));
    }

    private static boolean common(int[] a, int[] b) {

        if (a.length >= 1 && b.length >= 1) {
            if (a[0] == b[0] || a[a.length - 1] == b[b.length - 1]) {
                return true;
            }
            return false;
        }
        return false;
    }

}
