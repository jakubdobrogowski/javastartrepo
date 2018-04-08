package pl.sda.javastart.day2;

public class TernaryOperator {

    public static void main(String[] args) {

        System.out.println("Liczba "+ 3 + " wieksza od zera -> "+ (numberBiggerThanzero(3)? "tak":"nie"));
    }

    public static boolean numberBiggerThanzero(int number){

        return number>0;
    }
}
