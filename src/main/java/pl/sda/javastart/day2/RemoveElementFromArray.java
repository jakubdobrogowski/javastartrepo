package pl.sda.javastart.day2;

import java.util.LinkedList;
import java.util.List;

public class RemoveElementFromArray {

    public static void main(String[] args) {


    }

    public static Object[] remove(String[] input, String deleteMe) {

        List result = new LinkedList();

        for (String item : input)
            if (!deleteMe.equals(item))
                result.add(item);

        return result.toArray(input);
    }

}
