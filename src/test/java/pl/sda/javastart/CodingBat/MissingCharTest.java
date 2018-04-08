package pl.sda.javastart.CodingBat;

import org.junit.jupiter.api.Test;
import pl.sda.javastart.CodingBat.WarmUp.MissingChar;

class MissingCharTest {

    @Test
    public void testMiss() {

        String pomocnicza = MissingChar.miss("kitten", 1);
        assert pomocnicza.equals("itten");
    }
}