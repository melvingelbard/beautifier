import java.util.stream.Collectors;


// TODO: handle quote escaping (e.g. "key": "\"")
// TODO: catch AssertionExceptions
public class Beautifyer {

    private static String tabString = "  ";

    public static String beautifyJson(String text) {
        int pointer = 0;
        String out = "";
        int braces = 0;
        int brackets = 0;
        int currentIndent = 0;
        boolean insideString = false;

        // Trim each line and remove new lines
        text = text.lines().map(line -> line.trim()).collect(Collectors.joining());

        while (pointer < text.length()) {
            char c = text.charAt(pointer);
            if (c == '"') { // TODO: Check for single quote as well?
                insideString = !insideString;
                out += c;
            } else if (!insideString) {
                if (c == '{') {
                    braces++;
                    out += c + System.lineSeparator() + repeat(++currentIndent, tabString);
                } else if (c == '}') {
                    braces--;
                    out += System.lineSeparator() + repeat(--currentIndent, tabString) + c;
                } else if (c == '[') {
                    brackets++;
                    out += c + System.lineSeparator() + repeat(++currentIndent, tabString);
                } else if (c == ']') {
                    brackets--;
                    out += System.lineSeparator() + repeat(--currentIndent, tabString) + c;
                } else if (c == ',') {
                    // Ignore space if there is one
                    if (pointer+1 < text.length() && text.charAt(pointer+1) == ' ')
                        pointer++;
                    out += c + System.lineSeparator() + repeat(currentIndent, tabString);
                } else if (c == ':') {
                    out += c;
                    // Add space if there isn't one
                    if (pointer+1 < text.length() && text.charAt(pointer+1) != ' ')
                        out += ' ';
                } else
                    out += c;
            } else
                out += c;

            pointer++;
        }

        assert braces == 0;
        assert brackets == 0;
        return out;
    }

    /**
     * Repeat the {@code word} {@code count} times.
     * <p>
     * Based on https://stackoverflow.com/questions/2255500/can-i-multiply-strings-in-java-to-repeat-sequences
     * @param count How many time to repeat the word
     * @param word  The word to repeat
     * @return      the repeated word as a String
     */
    public static String repeat(int count, String word) {
        if (count <= 0)
            return "";
        return new String(new char[count]).replace("\0", word);
    }
}