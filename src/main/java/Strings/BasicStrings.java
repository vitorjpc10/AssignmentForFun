package Strings;

public class BasicStrings {

    public String flipConcat(String string1, String string2) {
        return string2.concat(string1);
    }

    public char getChar(String string, int index) {
        return string.charAt(index);
    }

    public String iCantSee(String string) {
        String value = "";

        for (int i = 0; i < string.length(); i++) {
            value += " ";
        }

        return value;
    }

    public String loudAndClear(String string) {
        return string.toUpperCase();
    }

    public String reverseCase(String string) {

        StringBuffer buffer = new StringBuffer(string);

        for (int i = 0; i < string.length(); i++) {
            Character c = buffer.charAt(i);
            if (Character.isLowerCase(c))
                buffer.replace(i, i + 1,
                        Character.toUpperCase(c) + "");
            else
                buffer.replace(i, i + 1,
                        Character.toLowerCase(c) + "");
        }

        return buffer.toString();
    }

    public String oneAtATime(String string1, String string2) {

        String finalStr = "";

        int smallest = Math.min(string1.length(), string2.length());
        
        for (int i = 0; i < smallest; i++) {
            finalStr += string1.charAt(i);
            finalStr += string2.charAt(i);
        }

        if (string1.length() == string2.length()) {
            return finalStr;
        }

        if (string1.length() < string2.length()) {
            finalStr += string2.substring(string1.length(), string2.length());
        } else {
            finalStr += string1.substring(string2.length(), string1.length());
        }

        return finalStr;
    }
}
