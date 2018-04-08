package pl.sda.javastart.day2;

public class NoteverythingInArrays {

    public static void main(String[] args) {

        noteverything(5, 8);
    }

    private static void noteverything(int size, int lenght) {

        int[] tab = new int[lenght<size? size : lenght];

        for (int i = 0; i <size; i++) {

            tab[i] = i+1;
        }

        for (int i = 0; i < tab.length; i++) {
            System.out.println(tab[i]);
        }


    }

}
