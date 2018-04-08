package pl.sda.javastart.CodingBat.Strings;

import java.util.Scanner;

public class MinCat {

    public static void main(String[] args) {

        Scanner cin = new Scanner(System.in);

        System.out.println("Podaj dwa słowa");

        String worldOne = cin.nextLine();
        String worldTwo = cin.nextLine();

        System.out.println(minCat(worldOne, worldTwo));
    }

    private static String minCat(String  strOne, String strTwo) {
        if (strOne.length() == strTwo.length()){

            return strOne + strTwo;
        }

        if(strOne.length() > strTwo.length()){

            return strOne.substring(strOne.length() - strTwo.length(), strOne.length()) + strTwo;
        }else {

            return strOne + strTwo.substring(strTwo.length() - strOne.length(), strTwo.length());
        }
    }


}
