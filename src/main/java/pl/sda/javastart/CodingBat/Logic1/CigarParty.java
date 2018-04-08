package pl.sda.javastart.CodingBat.Logic1;

public class CigarParty {

    public static void main(String[] args) {

        boolean isWeekend = true;
        int cigars = 30;
        System.out.println(ciggar(isWeekend, cigars));

    }

    private static boolean ciggar(boolean isWeekend, int cigars) {

        if ((cigars >= 40 && cigars <= 60) && !isWeekend) {

            return true;
        }

        if (isWeekend && cigars >= 40) {
            return true;
        }
        return false;

    }
}

