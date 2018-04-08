package pl.sda.javastart.day2;

public class Tower {

    public static void main(String[] args) {

        numbers();
    }

    public static void numbers() {

        for (int i = 1; i < 10; i++) {

            for (int k = 1; k <= i; k++) {
                System.out.print(k);
            }
            System.out.println("");

        }
    }
}
