package pl.sda.javastart.CodingBat.WarmUp;

public class BackAround {

    public static void main(String[] args) {

        String str = "Cat";
        back(str);


    }

    public static void back(String vStr) {

        char[] tab = vStr.toCharArray();
        System.out.println(tab[vStr.length() - 1] + vStr + tab[vStr.length() - 1]);
    }

}
