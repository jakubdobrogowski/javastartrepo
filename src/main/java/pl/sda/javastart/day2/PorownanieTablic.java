package pl.sda.javastart.day2;

public class PorownanieTablic {

    public static void main(String[] args) {

        int [] arrayOne = {1,2,3};
        int [] arrayTwo = {1,2,3};

        System.out.println(equals(arrayOne, arrayTwo));
    }

    public static boolean equals(int [] a, int [] b) {

        int iterrator=0;
        ;
        for (int element: a) {

            if(element==b[iterrator]){

                return true;
            }
        }

        return false;
    }

}
