package ArraysAndStrings;

import java.util.Arrays;

class ArraysAndStrings {

    static boolean isUnique(String input) {
        for (int i = 0; i < input.length(); i++) {
            for (int j = i + 1; j < input.length(); j++) {
                if (input.charAt(i) == input.charAt(j)) {
                    return false;
                }
            }
        }
        return true;
    }

    static boolean isPermutation(String string1, String string2) {
        return Arrays.equals(sortToArray(string1), sortToArray(string2));
    }

    private static char[] sortToArray(String string) {
        char[] chars = string.toCharArray();
        Arrays.sort(chars);
        return chars;
    }

    static String URLify(String input, int trueLength) {
        char[] characters = new char[input.length()];
        int index = 0;
        for (int i=0; i < trueLength; i++) {
            char current = input.charAt(i);
            if (current == ' ') {
                characters[index++] = '%';
                characters[index++] = '2';
                characters[index++] = '0';
            } else {
                characters[index++] = current;
            }
        }
        return new String(characters);
    }

    static boolean oneAway(String string1, String string2) {
        if (Math.abs(string1.length() - string2.length()) > 1) {
            return false;
        }
        boolean editUsed = false;
        if (string1.length() == string2.length()) {
            for (int i = 0; i < string1.length(); i++) {
                if (string1.charAt(i) != string2.charAt(i) && !editUsed) {
                    editUsed = true;
                } else if (string1.charAt(i) != string2.charAt(i) && editUsed) {
                    return false;
                }
            }
        } else {
            int index = 0;
            String longer = string1;
            String shorter = string2;
            if (string1.length() < string2.length()) {
                longer = string2;
                shorter = string1;
            }
            for (int j = 0; j < shorter.length(); j++) {
                if (longer.charAt(index) != shorter.charAt(j) && !editUsed) {
                    editUsed = true;
                    index++;
                } else if (longer.charAt(index) != shorter.charAt(j) && editUsed) {
                    return false;
                }
                index++;
            }
        }
        return true;
    }
}
