package pl.sda.javastart.CodingBat.Strings;

public class LastTwo {

    public static void main(String[] args) {

        String world = "";
        System.out.println(last(world));
    }

    private static String last(String str) {
        if (str.length() == 1) {

            return str;
        }

        if (str.length() >= 2) {
            char[] arrayChar = str.toCharArray();
            String strTwo = str.substring(0, str.length() - 2);
            char a = arrayChar[str.length() - 1];
            char b = arrayChar[str.length() - 2];
            return strTwo + a + b;
        }
        return "";
    }

}