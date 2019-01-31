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
}
