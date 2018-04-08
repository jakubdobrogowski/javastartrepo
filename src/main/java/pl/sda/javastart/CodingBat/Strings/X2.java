package pl.sda.javastart.CodingBat.Strings;

public class X2 {

    public static void main(String[] args) {

        String world = "xaxb";
        System.out.println(withoutX2(world));
    }

    private static String withoutX2(String str) {

        if (str.length() == 0) {
            return "";
        }
        if (str.length() == 1) {
            return str.replace("x", "");
        }

        String newWorldOne = str.substring(0, 2);
        String bewWorldTwo = str.substring(2, str.length());
        String actualValue = newWorldOne.replace("x", "");

        return actualValue + bewWorldTwo;


    }
}


