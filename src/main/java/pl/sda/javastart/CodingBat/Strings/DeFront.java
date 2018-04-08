package pl.sda.javastart.CodingBat.Strings;

public class DeFront {

    public static void main(String[] args) {

        String world = "xby";
        System.out.println(front(world));


    }

    private static String front(String str) {


        if (str.indexOf("a") == 0) {

            if (str.indexOf("b") == 1) {

                return "ab" + str.substring(2, str.length());
            } else {

                return "a" + str.substring(2, str.length());
            }

        }
        if (str.indexOf("b") == 0) {
            String str1 = "x" + str.substring(1, str.length());
            if (str1.indexOf("b") == 1) {
                return "b" + str.substring(2, str.length());
            }
        }
        if (str.indexOf("b") == 1) {
            System.out.println("Tu");
            return "b" + str.substring(2, str.length());
        }
            return str.substring(2, str.length());
        }
    }

