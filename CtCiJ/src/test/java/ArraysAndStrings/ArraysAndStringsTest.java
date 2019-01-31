package ArraysAndStrings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArraysAndStringsTest {

    @Test
    void testURLify() {
        assertEquals("Mr%20John%20Smith",
                ArraysAndStrings.URLify("Mr John Smith    ", 13));
    }

    @Test
    void testIsPermutation() {
        assertTrue(ArraysAndStrings.isPermutation("bombay", "baymob"));
        assertFalse(ArraysAndStrings.isPermutation("soros", "sors"));
    }

    @Test
    void testIfIsUniqueReturnsFalse() {
        assertFalse(ArraysAndStrings.isUnique("fgdghd"));
    }

    @Test
    void testIfIsUniqueReturnsTrue() {
        assertTrue(ArraysAndStrings.isUnique("igen"));
    }

    @Test
    void testOneAway() {
        assertTrue(ArraysAndStrings.oneAway("pale", "ple"));
        assertTrue(ArraysAndStrings.oneAway("pales", "pale"));
        assertTrue(ArraysAndStrings.oneAway("bale", "bale"));
        assertTrue(ArraysAndStrings.oneAway("pale", "bale"));
        assertFalse(ArraysAndStrings.oneAway("pale", "bae"));
    }

    @Test
    void testCompressWithRepetionInInput() {
        assertEquals("a2b1c5a3", ArraysAndStrings.compress("aabcccccaaa"));
    }

    @Test
    void testCompressWithoutRepetitionInInput() {
        assertEquals("abcde", ArraysAndStrings.compress("abcde"));
    }
}