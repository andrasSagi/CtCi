package ArraysAndStrings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArraysAndStringsTest {

    @Test
    void testURLify() {
        assertEquals("Mr%20John%20Smith",
                ArraysAndStrings.URLify("Mr John Smith    ", 13));
    }

}