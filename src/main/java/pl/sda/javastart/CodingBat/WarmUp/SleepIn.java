package pl.sda.javastart.CodingBat.WarmUp;

public class SleepIn {

    public static void main(String[] args) {

        boolean w = false;
        boolean v = true;
        System.out.println(sleepIn(w, v));


    }

    public static boolean sleepIn(boolean weekday, boolean vacation) {

        if (!weekday && vacation) {

            return true;
        }
        return false;

    }


}