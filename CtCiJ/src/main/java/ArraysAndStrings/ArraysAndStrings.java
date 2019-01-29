package ArraysAndStrings;

class ArraysAndStrings {

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
