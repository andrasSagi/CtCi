package ArraysAndStrings;

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
